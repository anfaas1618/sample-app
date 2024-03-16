package com.application.app.modules.profiledetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityProfileDetailsBinding
import com.application.app.modules.profiledetails.`data`.model.ProfileDetails1RowModel
import com.application.app.modules.profiledetails.`data`.model.ProfileDetails2RowModel
import com.application.app.modules.profiledetails.`data`.viewmodel.ProfileDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProfileDetailsActivity :
    BaseActivity<ActivityProfileDetailsBinding>(R.layout.activity_profile_details) {
  private val viewModel: ProfileDetailsVM by viewModels<ProfileDetailsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGroup1623Adapter =
    RecyclerGroup1623Adapter(viewModel.recyclerGroup1623List.value?:mutableListOf())
    binding.recyclerGroup1623.adapter = recyclerGroup1623Adapter
    recyclerGroup1623Adapter.setOnItemClickListener(
    object : RecyclerGroup1623Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProfileDetails1RowModel) {
        onClickRecyclerGroup1623(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup1623List.observe(this) {
      recyclerGroup1623Adapter.updateData(it)
    }
    val recyclerGroup1624Adapter =
    RecyclerGroup1624Adapter(viewModel.recyclerGroup1624List.value?:mutableListOf())
    binding.recyclerGroup1624.adapter = recyclerGroup1624Adapter
    recyclerGroup1624Adapter.setOnItemClickListener(
    object : RecyclerGroup1624Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProfileDetails2RowModel) {
        onClickRecyclerGroup1624(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup1624List.observe(this) {
      recyclerGroup1624Adapter.updateData(it)
    }
    binding.profileDetailsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup1623(
    view: View,
    position: Int,
    item: ProfileDetails1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup1624(
    view: View,
    position: Int,
    item: ProfileDetails2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "PROFILE_DETAILS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
