package com.samuel.plag_emovil.ui.tutorials

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TutorialsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the Tutorials Fragment"
    }
    val text: LiveData<String> = _text
}