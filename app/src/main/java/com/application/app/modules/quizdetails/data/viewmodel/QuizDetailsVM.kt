package com.application.app.modules.quizdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.quizdetails.`data`.model.QuizDetailsModel
import org.koin.core.KoinComponent

public class QuizDetailsVM : ViewModel(), KoinComponent {
  public val quizDetailsModel: MutableLiveData<QuizDetailsModel> =
      MutableLiveData(QuizDetailsModel())

  public var navArguments: Bundle? = null
}
