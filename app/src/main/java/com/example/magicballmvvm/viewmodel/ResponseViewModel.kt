package com.example.magicballmvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.magicballmvvm.model.ResponseModel
import com.example.magicballmvvm.model.ResponseProvider

class ResponseViewModel : ViewModel() {

    val responseModel = MutableLiveData<ResponseModel>()

    fun randomResponse(){
        val currentResponse : ResponseModel = ResponseProvider.random()
        responseModel.postValue(currentResponse)
    }

}