package com.application.app.modules.reviewquiz.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.reviewquiz.`data`.model.ReviewQuiz1RowModel
import com.application.app.modules.reviewquiz.`data`.model.ReviewQuizModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class ReviewQuizVM : ViewModel(), KoinComponent {
  public val reviewQuizModel: MutableLiveData<ReviewQuizModel> = MutableLiveData(ReviewQuizModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup1875List: MutableLiveData<MutableList<ReviewQuiz1RowModel>> =
      MutableLiveData(mutableListOf())
}
