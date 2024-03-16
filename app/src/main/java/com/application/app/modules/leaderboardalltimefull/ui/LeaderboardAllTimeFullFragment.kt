package com.application.app.modules.leaderboardalltimefull.ui

import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseFragment
import com.application.app.databinding.FragmentLeaderboardAllTimeFullBinding
import com.application.app.modules.leaderboardalltimefull.`data`.viewmodel.LeaderboardAllTimeFullVM
import kotlin.String
import kotlin.Unit

public class LeaderboardAllTimeFullFragment :
    BaseFragment<FragmentLeaderboardAllTimeFullBinding>(R.layout.fragment_leaderboard_all_time_full)
    {
  private val viewModel: LeaderboardAllTimeFullVM by viewModels<LeaderboardAllTimeFullVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.leaderboardAllTimeFullVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "LEADERBOARD_ALL_TIME_FULL_FRAGMENT"
  }
}
