package com.application.app.modules.createquiz.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.createquiz.`data`.model.CreateQuizModel
import org.koin.core.KoinComponent

public class CreateQuizVM : ViewModel(), KoinComponent {
  public val createQuizModel: MutableLiveData<CreateQuizModel> = MutableLiveData(CreateQuizModel())

  public var navArguments: Bundle? = null
}
