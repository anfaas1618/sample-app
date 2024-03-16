package com.application.app.modules.createquizcheckboxaddanswer.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class CreateQuizCheckboxAddAnswerModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddAnswer: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_answer2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCorrectAnswer: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_correct_answer2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etAddAnswerValue: String? = null
)
