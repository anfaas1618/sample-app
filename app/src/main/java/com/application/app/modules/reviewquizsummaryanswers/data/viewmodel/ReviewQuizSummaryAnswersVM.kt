package com.application.app.modules.reviewquizsummaryanswers.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.reviewquizsummaryanswers.`data`.model.ReviewQuizSummaryAnswers1RowModel
import com.application.app.modules.reviewquizsummaryanswers.`data`.model.ReviewQuizSummaryAnswers2RowModel
import com.application.app.modules.reviewquizsummaryanswers.`data`.model.ReviewQuizSummaryAnswersModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class ReviewQuizSummaryAnswersVM : ViewModel(), KoinComponent {
  public val reviewQuizSummaryAnswersModel: MutableLiveData<ReviewQuizSummaryAnswersModel> =
      MutableLiveData(ReviewQuizSummaryAnswersModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup1780List: MutableLiveData<MutableList<ReviewQuizSummaryAnswers1RowModel>>
      = MutableLiveData(mutableListOf())

  public val recyclerGroup1781List: MutableLiveData<MutableList<ReviewQuizSummaryAnswers2RowModel>>
      = MutableLiveData(mutableListOf())
}
