package com.application.app.modules.leaderboardweeklyfull.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LeaderboardWeeklyFull1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDavisCurtis: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_davis_curtis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2569Points: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_2_569_points)

)
