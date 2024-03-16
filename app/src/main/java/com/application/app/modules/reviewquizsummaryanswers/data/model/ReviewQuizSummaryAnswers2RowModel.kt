package com.application.app.modules.reviewquizsummaryanswers.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ReviewQuizSummaryAnswers2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt7: String? = MyApp.getInstance().resources.getString(R.string.lbl_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhichThreePla: String? =
      MyApp.getInstance().resources.getString(R.string.msg_which_three_pla)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMohamedSalah: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mohamed_salah)

)
