package com.application.app.modules.createquizcheckbox.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.createquizcheckbox.`data`.model.CreateQuizCheckboxModel
import org.koin.core.KoinComponent

public class CreateQuizCheckboxVM : ViewModel(), KoinComponent {
  public val createQuizCheckboxModel: MutableLiveData<CreateQuizCheckboxModel> =
      MutableLiveData(CreateQuizCheckboxModel())

  public var navArguments: Bundle? = null
}
