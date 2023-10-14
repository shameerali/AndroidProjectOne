package com.example.androidfour.flow.first.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.androidfour.R
import com.example.androidfour.databinding.ActivityFlowFirstBinding
import com.example.androidfour.flow.first.network.Status
import com.example.androidfour.flow.first.viewmodel.CommentsViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class FlowFirstActivity : AppCompatActivity() {

    // create a CommentsViewModel
    // variable to initialize it later
    private lateinit var viewModel: CommentsViewModel

    // create a view binding variable
    private lateinit var binding:ActivityFlowFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_flow_first)
        // instantiate view binding
        binding = ActivityFlowFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // initialize viewModel
        viewModel = ViewModelProvider(this).get(CommentsViewModel::class.java)

        // Listen for the button click event to search
        binding.btnSearch.setOnClickListener {

            // check to prevent api call with no parameters
            if (binding.edtSearch.text.isNullOrEmpty()) {
                Toast.makeText(this, "Query Can't be empty", Toast.LENGTH_SHORT).show()
            } else {
                // if Query isn't empty, make the api call
                viewModel.getNewComment(binding.edtSearch.text.toString().toInt())
            }
        }

        // Since flow run asynchronously,
        // start listening on background thread
        lifecycleScope.launch {
            viewModel.commentState.collect {

                // When state to check the
                // state of received data
                when (it.status) {
                    // If its loading state then
                    // show the progress bar
                    Status.LOADING -> {
                        binding.progressBar.isVisible = true
                    }

                    // If api call was a success , Update the Ui with
                    // data and make progress bar invisible
                    Status.SUCCESS -> {
                        binding.progressBar.isVisible = false

                        // Received data can be null, put a check to prevent
                        // null pointer exception
                        it.data?.let { comment ->
                            binding.commentIdTextview.text = comment.id.toString()
                            binding.nameTextview.text = comment.name
                            binding.emailTextview.text = comment.email
                            binding.commentTextview.text = comment.comment
                        }
                    }

                    // In case of error, show some data to user
                    else -> {
                        binding.progressBar.isVisible = false
                        Toast.makeText(this@FlowFirstActivity, "${it.message}", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }

    }
}