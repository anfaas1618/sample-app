package com.application.app.modules.quizcategories.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.quizcategories.`data`.model.QuizCategories1RowModel
import com.application.app.modules.quizcategories.`data`.model.QuizCategoriesModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class QuizCategoriesVM : ViewModel(), KoinComponent {
  public val quizCategoriesModel: MutableLiveData<QuizCategoriesModel> =
      MutableLiveData(QuizCategoriesModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup2132List: MutableLiveData<MutableList<QuizCategories1RowModel>> =
      MutableLiveData(mutableListOf())
}
