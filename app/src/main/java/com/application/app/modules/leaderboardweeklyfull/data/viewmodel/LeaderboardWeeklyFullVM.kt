package com.application.app.modules.leaderboardweeklyfull.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.leaderboardweeklyfull.`data`.model.LeaderboardWeeklyFull1RowModel
import com.application.app.modules.leaderboardweeklyfull.`data`.model.LeaderboardWeeklyFullModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class LeaderboardWeeklyFullVM : ViewModel(), KoinComponent {
  public val leaderboardWeeklyFullModel: MutableLiveData<LeaderboardWeeklyFullModel> =
      MutableLiveData(LeaderboardWeeklyFullModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup1214List: MutableLiveData<MutableList<LeaderboardWeeklyFull1RowModel>> =
      MutableLiveData(mutableListOf())
}
