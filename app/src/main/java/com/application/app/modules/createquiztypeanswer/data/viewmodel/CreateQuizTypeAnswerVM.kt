package com.application.app.modules.createquiztypeanswer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.createquiztypeanswer.`data`.model.CreateQuizTypeAnswerModel
import org.koin.core.KoinComponent

public class CreateQuizTypeAnswerVM : ViewModel(), KoinComponent {
  public val createQuizTypeAnswerModel: MutableLiveData<CreateQuizTypeAnswerModel> =
      MutableLiveData(CreateQuizTypeAnswerModel())

  public var navArguments: Bundle? = null
}
