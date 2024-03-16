package com.application.app.modules.leaderboardalltimefull1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LeaderboardAllTimeFull1Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLeaderboard: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_leaderboard)

)
