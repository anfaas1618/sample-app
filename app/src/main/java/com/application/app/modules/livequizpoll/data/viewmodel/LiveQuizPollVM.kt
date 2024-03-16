package com.application.app.modules.livequizpoll.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.livequizpoll.`data`.model.LiveQuizPollModel
import org.koin.core.KoinComponent

public class LiveQuizPollVM : ViewModel(), KoinComponent {
  public val liveQuizPollModel: MutableLiveData<LiveQuizPollModel> =
      MutableLiveData(LiveQuizPollModel())

  public var navArguments: Bundle? = null
}
