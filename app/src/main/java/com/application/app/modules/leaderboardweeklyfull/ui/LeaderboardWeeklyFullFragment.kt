package com.application.app.modules.leaderboardweeklyfull.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseFragment
import com.application.app.databinding.FragmentLeaderboardWeeklyFullBinding
import com.application.app.modules.leaderboardweeklyfull.`data`.model.LeaderboardWeeklyFull1RowModel
import com.application.app.modules.leaderboardweeklyfull.`data`.viewmodel.LeaderboardWeeklyFullVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class LeaderboardWeeklyFullFragment :
    BaseFragment<FragmentLeaderboardWeeklyFullBinding>(R.layout.fragment_leaderboard_weekly_full) {
  private val viewModel: LeaderboardWeeklyFullVM by viewModels<LeaderboardWeeklyFullVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val recyclerGroup1214Adapter =
    RecyclerGroup1214Adapter(viewModel.recyclerGroup1214List.value?:mutableListOf())
    binding.recyclerGroup1214.adapter = recyclerGroup1214Adapter
    recyclerGroup1214Adapter.setOnItemClickListener(
    object : RecyclerGroup1214Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      LeaderboardWeeklyFull1RowModel) {
        onClickRecyclerGroup1214(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup1214List.observe(requireActivity()) {
      recyclerGroup1214Adapter.updateData(it)
    }
    binding.leaderboardWeeklyFullVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup1214(
    view: View,
    position: Int,
    item: LeaderboardWeeklyFull1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "LEADERBOARD_WEEKLY_FULL_FRAGMENT"
  }
}
