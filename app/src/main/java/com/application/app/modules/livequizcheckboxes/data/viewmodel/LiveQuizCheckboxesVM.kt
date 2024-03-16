package com.application.app.modules.livequizcheckboxes.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.livequizcheckboxes.`data`.model.LiveQuizCheckboxesModel
import org.koin.core.KoinComponent

public class LiveQuizCheckboxesVM : ViewModel(), KoinComponent {
  public val liveQuizCheckboxesModel: MutableLiveData<LiveQuizCheckboxesModel> =
      MutableLiveData(LiveQuizCheckboxesModel())

  public var navArguments: Bundle? = null
}
