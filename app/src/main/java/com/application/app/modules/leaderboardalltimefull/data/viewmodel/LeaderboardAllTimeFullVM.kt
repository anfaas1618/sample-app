package com.application.app.modules.leaderboardalltimefull.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.leaderboardalltimefull.`data`.model.LeaderboardAllTimeFullModel
import org.koin.core.KoinComponent

public class LeaderboardAllTimeFullVM : ViewModel(), KoinComponent {
  public val leaderboardAllTimeFullModel: MutableLiveData<LeaderboardAllTimeFullModel> =
      MutableLiveData(LeaderboardAllTimeFullModel())

  public var navArguments: Bundle? = null
}
