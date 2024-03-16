package com.application.app.modules.settings.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySettingsBinding
import com.application.app.modules.settings.`data`.model.Settings1RowModel
import com.application.app.modules.settings.`data`.viewmodel.SettingsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class SettingsActivity : BaseActivity<ActivitySettingsBinding>(R.layout.activity_settings) {
  private val viewModel: SettingsVM by viewModels<SettingsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGroup461Adapter =
    RecyclerGroup461Adapter(viewModel.recyclerGroup461List.value?:mutableListOf())
    binding.recyclerGroup461.adapter = recyclerGroup461Adapter
    recyclerGroup461Adapter.setOnItemClickListener(
    object : RecyclerGroup461Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Settings1RowModel) {
        onClickRecyclerGroup461(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup461List.observe(this) {
      recyclerGroup461Adapter.updateData(it)
    }
    binding.settingsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup461(
    view: View,
    position: Int,
    item: Settings1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "SETTINGS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SettingsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
