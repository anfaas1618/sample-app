package com.application.app.modules.home.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Home1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtStatisticsMath: String? =
      MyApp.getInstance().resources.getString(R.string.msg_statistics_math)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMath12Quizz: String? =
      MyApp.getInstance().resources.getString(R.string.msg_math_12_quizz)

)
