package com.application.app.modules.livequizmultiplechoices.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.livequizmultiplechoices.`data`.model.LiveQuizMultipleChoicesModel
import org.koin.core.KoinComponent

public class LiveQuizMultipleChoicesVM : ViewModel(), KoinComponent {
  public val liveQuizMultipleChoicesModel: MutableLiveData<LiveQuizMultipleChoicesModel> =
      MutableLiveData(LiveQuizMultipleChoicesModel())

  public var navArguments: Bundle? = null
}
