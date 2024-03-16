package com.application.app.modules.onboarding1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityOnboarding1Binding
import com.application.app.modules.onboarding1.`data`.viewmodel.Onboarding1VM
import kotlin.String
import kotlin.Unit

public class Onboarding1Activity :
    BaseActivity<ActivityOnboarding1Binding>(R.layout.activity_onboarding_1) {
  private val viewModel: Onboarding1VM by viewModels<Onboarding1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboarding1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "ONBOARDING1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Onboarding1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
