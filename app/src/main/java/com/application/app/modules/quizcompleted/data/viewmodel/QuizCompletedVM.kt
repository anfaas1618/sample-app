package com.application.app.modules.quizcompleted.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.quizcompleted.`data`.model.QuizCompleted1RowModel
import com.application.app.modules.quizcompleted.`data`.model.QuizCompletedModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class QuizCompletedVM : ViewModel(), KoinComponent {
  public val quizCompletedModel: MutableLiveData<QuizCompletedModel> =
      MutableLiveData(QuizCompletedModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup1792List: MutableLiveData<MutableList<QuizCompleted1RowModel>> =
      MutableLiveData(mutableListOf())
}
