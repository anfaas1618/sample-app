package com.application.app.modules.createquizmultiplechoices1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class CreateQuizMultipleChoices2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddAnswer: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_answer)

)
