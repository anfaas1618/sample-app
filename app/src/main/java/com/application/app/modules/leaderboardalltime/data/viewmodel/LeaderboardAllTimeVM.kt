package com.application.app.modules.leaderboardalltime.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.leaderboardalltime.`data`.model.LeaderboardAllTimeModel
import org.koin.core.KoinComponent

public class LeaderboardAllTimeVM : ViewModel(), KoinComponent {
  public val leaderboardAllTimeModel: MutableLiveData<LeaderboardAllTimeModel> =
      MutableLiveData(LeaderboardAllTimeModel())

  public var navArguments: Bundle? = null
}
