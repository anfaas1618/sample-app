package com.application.app.modules.leaderboardalltime.ui

import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseFragment
import com.application.app.databinding.FragmentLeaderboardAllTimeBinding
import com.application.app.modules.leaderboardalltime.`data`.viewmodel.LeaderboardAllTimeVM
import kotlin.String
import kotlin.Unit

public class LeaderboardAllTimeFragment :
    BaseFragment<FragmentLeaderboardAllTimeBinding>(R.layout.fragment_leaderboard_all_time) {
  private val viewModel: LeaderboardAllTimeVM by viewModels<LeaderboardAllTimeVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.leaderboardAllTimeVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "LEADERBOARD_ALL_TIME_FRAGMENT"
  }
}
