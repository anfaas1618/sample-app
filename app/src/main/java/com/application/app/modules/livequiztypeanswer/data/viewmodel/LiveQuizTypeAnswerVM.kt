package com.application.app.modules.livequiztypeanswer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.livequiztypeanswer.`data`.model.LiveQuizTypeAnswerModel
import org.koin.core.KoinComponent

public class LiveQuizTypeAnswerVM : ViewModel(), KoinComponent {
  public val liveQuizTypeAnswerModel: MutableLiveData<LiveQuizTypeAnswerModel> =
      MutableLiveData(LiveQuizTypeAnswerModel())

  public var navArguments: Bundle? = null
}
