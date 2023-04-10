package com.example.androidfour

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import androidx.fragment.app.Fragment

class ToolbarFragment : Fragment(), SeekBar.OnSeekBarChangeListener {


    lateinit var editText:EditText
    var seekvalue =12
    var activityCallback: ToolbarFragment.ToolbarListener? = null
    interface ToolbarListener {
        fun onButtonClick(position: Int, text: String)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            activityCallback = context as ToolbarListener
        } catch (e: ClassCastException) {
            throw ClassCastException(context?.toString()
                    + " must implement ToolbarListener")
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.toolbar_fragment,
            container, false)

        editText = view.findViewById<EditText>(R.id.editText)
        val seekBar: SeekBar? = view?.findViewById(R.id.seekBar)
        val button: Button? = view?.findViewById(R.id.but)

        seekBar?.setOnSeekBarChangeListener(this)
        button?.setOnClickListener { v: View -> buttonClicked(v)}
        return view
//        return super.onCreateView(inflater, container, savedInstanceState)
    }

    private fun buttonClicked(view: View) {

        activityCallback?.onButtonClick(seekvalue,
            editText.text.toString())
    }

    override fun onProgressChanged(p0: SeekBar?, progress: Int, p2: Boolean) {
        seekvalue = progress
    }

    override fun onStartTrackingTouch(p0: SeekBar?) {
       // TODO("Not yet implemented")
    }

    override fun onStopTrackingTouch(p0: SeekBar?) {
      //  TODO("Not yet implemented")
    }
}