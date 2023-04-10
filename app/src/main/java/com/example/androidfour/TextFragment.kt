package com.example.androidfour

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class TextFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.text_fragment,
        container, false)

        return view

//        return super.onCreateView(inflater, container, savedInstanceState)
    }

    fun changeText(fontsize: Int, text: String)
    {
        val textView = view?.findViewById<TextView>(R.id.textView)
        textView?.textSize = fontsize.toFloat()
        textView?.text = text
    }
}