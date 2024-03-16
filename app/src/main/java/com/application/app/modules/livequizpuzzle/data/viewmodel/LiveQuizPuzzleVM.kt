package com.application.app.modules.livequizpuzzle.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.livequizpuzzle.`data`.model.LiveQuizPuzzleModel
import org.koin.core.KoinComponent

public class LiveQuizPuzzleVM : ViewModel(), KoinComponent {
  public val liveQuizPuzzleModel: MutableLiveData<LiveQuizPuzzleModel> =
      MutableLiveData(LiveQuizPuzzleModel())

  public var navArguments: Bundle? = null
}
