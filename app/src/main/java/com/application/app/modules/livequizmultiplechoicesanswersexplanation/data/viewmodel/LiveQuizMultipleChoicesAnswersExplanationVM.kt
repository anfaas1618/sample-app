package com.application.app.modules.livequizmultiplechoicesanswersexplanation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.livequizmultiplechoicesanswersexplanation.`data`.model.LiveQuizMultipleChoicesAnswersExplanationModel
import org.koin.core.KoinComponent

public class LiveQuizMultipleChoicesAnswersExplanationVM : ViewModel(), KoinComponent {
  public val liveQuizMultipleChoicesAnswersExplanationModel:
      MutableLiveData<LiveQuizMultipleChoicesAnswersExplanationModel> =
      MutableLiveData(LiveQuizMultipleChoicesAnswersExplanationModel())

  public var navArguments: Bundle? = null
}
