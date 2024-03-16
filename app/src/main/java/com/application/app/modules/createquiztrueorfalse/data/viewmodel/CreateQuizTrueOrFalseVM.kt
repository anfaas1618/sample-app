package com.application.app.modules.createquiztrueorfalse.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.createquiztrueorfalse.`data`.model.CreateQuizTrueOrFalseModel
import org.koin.core.KoinComponent

public class CreateQuizTrueOrFalseVM : ViewModel(), KoinComponent {
  public val createQuizTrueOrFalseModel: MutableLiveData<CreateQuizTrueOrFalseModel> =
      MutableLiveData(CreateQuizTrueOrFalseModel())

  public var navArguments: Bundle? = null
}
