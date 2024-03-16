package com.application.app.modules.createquizpuzzle.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.createquizpuzzle.`data`.model.CreateQuizPuzzleModel
import org.koin.core.KoinComponent

public class CreateQuizPuzzleVM : ViewModel(), KoinComponent {
  public val createQuizPuzzleModel: MutableLiveData<CreateQuizPuzzleModel> =
      MutableLiveData(CreateQuizPuzzleModel())

  public var navArguments: Bundle? = null
}
