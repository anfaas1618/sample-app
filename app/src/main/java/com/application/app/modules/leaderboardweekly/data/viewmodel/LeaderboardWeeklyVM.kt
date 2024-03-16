package com.application.app.modules.leaderboardweekly.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.leaderboardweekly.`data`.model.LeaderboardWeekly1RowModel
import com.application.app.modules.leaderboardweekly.`data`.model.LeaderboardWeeklyModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class LeaderboardWeeklyVM : ViewModel(), KoinComponent {
  public val leaderboardWeeklyModel: MutableLiveData<LeaderboardWeeklyModel> =
      MutableLiveData(LeaderboardWeeklyModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup1451List: MutableLiveData<MutableList<LeaderboardWeekly1RowModel>> =
      MutableLiveData(mutableListOf())
}
