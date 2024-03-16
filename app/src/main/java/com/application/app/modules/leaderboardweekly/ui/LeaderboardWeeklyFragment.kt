package com.application.app.modules.leaderboardweekly.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseFragment
import com.application.app.databinding.FragmentLeaderboardWeeklyBinding
import com.application.app.modules.leaderboardweekly.`data`.model.LeaderboardWeekly1RowModel
import com.application.app.modules.leaderboardweekly.`data`.viewmodel.LeaderboardWeeklyVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class LeaderboardWeeklyFragment :
    BaseFragment<FragmentLeaderboardWeeklyBinding>(R.layout.fragment_leaderboard_weekly) {
  private val viewModel: LeaderboardWeeklyVM by viewModels<LeaderboardWeeklyVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val recyclerGroup1451Adapter =
    RecyclerGroup1451Adapter(viewModel.recyclerGroup1451List.value?:mutableListOf())
    binding.recyclerGroup1451.adapter = recyclerGroup1451Adapter
    recyclerGroup1451Adapter.setOnItemClickListener(
    object : RecyclerGroup1451Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LeaderboardWeekly1RowModel) {
        onClickRecyclerGroup1451(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup1451List.observe(requireActivity()) {
      recyclerGroup1451Adapter.updateData(it)
    }
    binding.leaderboardWeeklyVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup1451(
    view: View,
    position: Int,
    item: LeaderboardWeekly1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "LEADERBOARD_WEEKLY_FRAGMENT"
  }
}
