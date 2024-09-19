package com.ismailmesutmujde.kotlincontext

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentTest : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        Toast.makeText(activity, "Hello", Toast.LENGTH_LONG).show()
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}