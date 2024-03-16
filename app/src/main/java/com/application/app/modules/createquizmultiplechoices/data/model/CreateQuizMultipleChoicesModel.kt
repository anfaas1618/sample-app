package com.application.app.modules.createquizmultiplechoices.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class CreateQuizMultipleChoicesModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddAnswer: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_answer2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddAnswer1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_answer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCorrectAnswer: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_correct_answer2)

)
