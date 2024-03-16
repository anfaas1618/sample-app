package com.application.app.modules.createquizcheckboxaddanswer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.createquizcheckboxaddanswer.`data`.model.CreateQuizCheckboxAddAnswerModel
import org.koin.core.KoinComponent

public class CreateQuizCheckboxAddAnswerVM : ViewModel(), KoinComponent {
  public val createQuizCheckboxAddAnswerModel: MutableLiveData<CreateQuizCheckboxAddAnswerModel> =
      MutableLiveData(CreateQuizCheckboxAddAnswerModel())

  public var navArguments: Bundle? = null
}
