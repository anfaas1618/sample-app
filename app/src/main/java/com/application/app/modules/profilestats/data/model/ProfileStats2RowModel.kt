package com.application.app.modules.profilestats.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ProfileStats2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt5: String? = MyApp.getInstance().resources.getString(R.string.lbl_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtQuizCreated: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_quiz_created)

)
