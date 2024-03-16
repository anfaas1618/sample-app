package com.application.app.modules.createquizmultiplechoices1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.createquizmultiplechoices1.`data`.model.CreateQuizMultipleChoices1Model
import com.application.app.modules.createquizmultiplechoices1.`data`.model.CreateQuizMultipleChoices2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class CreateQuizMultipleChoices1VM : ViewModel(), KoinComponent {
  public val createQuizMultipleChoices1Model: MutableLiveData<CreateQuizMultipleChoices1Model> =
      MutableLiveData(CreateQuizMultipleChoices1Model())

  public var navArguments: Bundle? = null

  public val recyclerGroup1957List: MutableLiveData<MutableList<CreateQuizMultipleChoices2RowModel>>
      = MutableLiveData(mutableListOf())
}
