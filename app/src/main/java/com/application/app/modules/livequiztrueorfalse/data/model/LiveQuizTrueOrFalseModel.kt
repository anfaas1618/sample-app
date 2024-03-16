package com.application.app.modules.livequiztrueorfalse.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LiveQuizTrueOrFalseModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt40: String? = MyApp.getInstance().resources.getString(R.string.lbl_40)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt4: String? = MyApp.getInstance().resources.getString(R.string.lbl_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtQUESTION4OF1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_question_4_of_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTheodorusOfSa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_theodorus_of_sa)

)
