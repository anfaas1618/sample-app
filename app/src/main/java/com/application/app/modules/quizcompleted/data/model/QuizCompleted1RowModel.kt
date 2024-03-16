package com.application.app.modules.quizcompleted.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class QuizCompleted1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCORRECTANSWER: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_correct_answer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt7Questions: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_7_questions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCOMPLETION: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_completion)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt80: String? = MyApp.getInstance().resources.getString(R.string.lbl_80)

)
