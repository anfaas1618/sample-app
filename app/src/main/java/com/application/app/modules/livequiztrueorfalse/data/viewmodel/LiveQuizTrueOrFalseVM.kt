package com.application.app.modules.livequiztrueorfalse.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.livequiztrueorfalse.`data`.model.LiveQuizTrueOrFalseModel
import org.koin.core.KoinComponent

public class LiveQuizTrueOrFalseVM : ViewModel(), KoinComponent {
  public val liveQuizTrueOrFalseModel: MutableLiveData<LiveQuizTrueOrFalseModel> =
      MutableLiveData(LiveQuizTrueOrFalseModel())

  public var navArguments: Bundle? = null
}
