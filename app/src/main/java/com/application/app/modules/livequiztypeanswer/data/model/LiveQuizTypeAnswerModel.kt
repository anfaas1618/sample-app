package com.application.app.modules.livequiztypeanswer.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LiveQuizTypeAnswerModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt20: String? = MyApp.getInstance().resources.getString(R.string.lbl_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt3: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtQUESTION5OF1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_question_5_of_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhoAreThreeP: String? =
      MyApp.getInstance().resources.getString(R.string.msg_who_are_three_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etWriteYourAnswValue: String? = null
)
