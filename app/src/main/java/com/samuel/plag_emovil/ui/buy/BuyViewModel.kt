package com.samuel.plag_emovil.ui.buy

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BuyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is buy Fragment"
    }
    val text: LiveData<String> = _text
}