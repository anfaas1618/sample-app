package com.application.app.modules.leaderboardalltimefull1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.leaderboardalltimefull1.`data`.model.LeaderboardAllTimeFull1Model
import org.koin.core.KoinComponent

public class LeaderboardAllTimeFull1VM : ViewModel(), KoinComponent {
  public val leaderboardAllTimeFull1Model: MutableLiveData<LeaderboardAllTimeFull1Model> =
      MutableLiveData(LeaderboardAllTimeFull1Model())

  public var navArguments: Bundle? = null
}
