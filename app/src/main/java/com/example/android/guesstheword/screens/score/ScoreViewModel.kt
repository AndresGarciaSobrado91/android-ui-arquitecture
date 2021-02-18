package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) : ViewModel() {

    private val _score = MutableLiveData<Int>()
    val score : LiveData<Int>
        get() = _score

    private val _eventPlayAgainClicked = MutableLiveData<Boolean>()
    val eventPlayAgainClicked: LiveData<Boolean>
        get() = _eventPlayAgainClicked


    init {
        Log.i("ScoreViewModel", "Final score is $finalScore")
        _score.value = finalScore
    }

    fun onPlayAgainClicked(){
        _eventPlayAgainClicked.value = true
    }

    fun onPlayAgainCompleted(){
        _eventPlayAgainClicked.value = false
    }

}