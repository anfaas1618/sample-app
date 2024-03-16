package com.application.app.modules.leaderboardalltimefull1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLeaderboardAllTimeFull1Binding
import com.application.app.modules.leaderboardalltimefull1.`data`.viewmodel.LeaderboardAllTimeFull1VM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

public class LeaderboardAllTimeFull1Activity :
    BaseActivity<ActivityLeaderboardAllTimeFull1Binding>(R.layout.activity_leaderboard_all_time_full1)
    {
  private val viewModel: LeaderboardAllTimeFull1VM by viewModels<LeaderboardAllTimeFull1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.leaderboardAllTimeFull1VM = viewModel
    val adapter = LeaderboardAllTimeFull1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerGroup721.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup23,binding.viewPagerGroup721) { tab, position ->
      tab.text = LeaderboardAllTimeFull1ActivityPagerAdapter.title[position]
      }.attach()
    }

    public override fun setUpClicks(): Unit {
    }

    public companion object {
      public const val TAG: String = "LEADERBOARD_ALL_TIME_FULL1ACTIVITY"

      public fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LeaderboardAllTimeFull1Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
