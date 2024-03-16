package com.application.app.modules.leaderboardweekly.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LeaderboardWeekly1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt5: String? = MyApp.getInstance().resources.getString(R.string.lbl_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtZainVaccaro: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_zain_vaccaro)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt448Points: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_448_points)

)
