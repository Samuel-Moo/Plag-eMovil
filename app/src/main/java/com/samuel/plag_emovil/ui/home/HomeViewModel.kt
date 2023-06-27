package com.samuel.plag_emovil.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }

    private  val _textNameRobot = MutableLiveData<String>().apply {
        value = "Plag-e 1"
    }

    private val _textRobotID = MutableLiveData<String>().apply {
        value = "#0001"
    }
    val text: LiveData<String> = _text
    val textNameRobot: LiveData<String> = _textNameRobot
    val textRobotID: LiveData<String> = _textRobotID

}