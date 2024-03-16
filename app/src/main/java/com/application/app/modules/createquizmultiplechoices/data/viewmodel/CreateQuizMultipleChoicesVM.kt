package com.application.app.modules.createquizmultiplechoices.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.createquizmultiplechoices.`data`.model.CreateQuizMultipleChoicesModel
import org.koin.core.KoinComponent

public class CreateQuizMultipleChoicesVM : ViewModel(), KoinComponent {
  public val createQuizMultipleChoicesModel: MutableLiveData<CreateQuizMultipleChoicesModel> =
      MutableLiveData(CreateQuizMultipleChoicesModel())

  public var navArguments: Bundle? = null
}
