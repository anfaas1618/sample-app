package com.application.app.modules.profilebadge.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityProfileBadgeBinding
import com.application.app.modules.profilebadge.`data`.model.ProfileBadge1RowModel
import com.application.app.modules.profilebadge.`data`.model.ProfileBadge2RowModel
import com.application.app.modules.profilebadge.`data`.viewmodel.ProfileBadgeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProfileBadgeActivity :
    BaseActivity<ActivityProfileBadgeBinding>(R.layout.activity_profile_badge) {
  private val viewModel: ProfileBadgeVM by viewModels<ProfileBadgeVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGroup1763Adapter =
    RecyclerGroup1763Adapter(viewModel.recyclerGroup1763List.value?:mutableListOf())
    binding.recyclerGroup1763.adapter = recyclerGroup1763Adapter
    recyclerGroup1763Adapter.setOnItemClickListener(
    object : RecyclerGroup1763Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProfileBadge1RowModel) {
        onClickRecyclerGroup1763(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup1763List.observe(this) {
      recyclerGroup1763Adapter.updateData(it)
    }
    val recyclerGroup1701Adapter =
    RecyclerGroup1701Adapter(viewModel.recyclerGroup1701List.value?:mutableListOf())
    binding.recyclerGroup1701.adapter = recyclerGroup1701Adapter
    recyclerGroup1701Adapter.setOnItemClickListener(
    object : RecyclerGroup1701Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProfileBadge2RowModel) {
        onClickRecyclerGroup1701(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup1701List.observe(this) {
      recyclerGroup1701Adapter.updateData(it)
    }
    binding.profileBadgeVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup1763(
    view: View,
    position: Int,
    item: ProfileBadge1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup1701(
    view: View,
    position: Int,
    item: ProfileBadge2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "PROFILE_BADGE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileBadgeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
