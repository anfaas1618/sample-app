package com.application.app.modules.profilestats.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityProfileStatsBinding
import com.application.app.modules.profilestats.`data`.model.ProfileStats1RowModel
import com.application.app.modules.profilestats.`data`.model.ProfileStats2RowModel
import com.application.app.modules.profilestats.`data`.viewmodel.ProfileStatsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProfileStatsActivity :
    BaseActivity<ActivityProfileStatsBinding>(R.layout.activity_profile_stats) {
  private val viewModel: ProfileStatsVM by viewModels<ProfileStatsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGroup1687Adapter =
    RecyclerGroup1687Adapter(viewModel.recyclerGroup1687List.value?:mutableListOf())
    binding.recyclerGroup1687.adapter = recyclerGroup1687Adapter
    recyclerGroup1687Adapter.setOnItemClickListener(
    object : RecyclerGroup1687Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProfileStats1RowModel) {
        onClickRecyclerGroup1687(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup1687List.observe(this) {
      recyclerGroup1687Adapter.updateData(it)
    }
    val recyclerGroup1643Adapter =
    RecyclerGroup1643Adapter(viewModel.recyclerGroup1643List.value?:mutableListOf())
    binding.recyclerGroup1643.adapter = recyclerGroup1643Adapter
    recyclerGroup1643Adapter.setOnItemClickListener(
    object : RecyclerGroup1643Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProfileStats2RowModel) {
        onClickRecyclerGroup1643(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup1643List.observe(this) {
      recyclerGroup1643Adapter.updateData(it)
    }
    binding.profileStatsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup1687(
    view: View,
    position: Int,
    item: ProfileStats1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup1643(
    view: View,
    position: Int,
    item: ProfileStats2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "PROFILE_STATS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileStatsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
