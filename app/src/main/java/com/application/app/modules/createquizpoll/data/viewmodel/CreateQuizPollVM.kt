package com.application.app.modules.createquizpoll.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.createquizpoll.`data`.model.CreateQuizPollModel
import org.koin.core.KoinComponent

public class CreateQuizPollVM : ViewModel(), KoinComponent {
  public val createQuizPollModel: MutableLiveData<CreateQuizPollModel> =
      MutableLiveData(CreateQuizPollModel())

  public var navArguments: Bundle? = null
}
