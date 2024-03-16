package com.application.app.modules.reviewquizsummaryanswers.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ReviewQuizSummaryAnswers1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCanYouNameTh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_can_you_name_th)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl)

)
