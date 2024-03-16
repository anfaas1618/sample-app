package com.application.app.modules.onboarding2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityOnboarding2Binding
import com.application.app.modules.onboarding2.`data`.viewmodel.Onboarding2VM
import kotlin.String
import kotlin.Unit

public class Onboarding2Activity :
    BaseActivity<ActivityOnboarding2Binding>(R.layout.activity_onboarding_2) {
  private val viewModel: Onboarding2VM by viewModels<Onboarding2VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboarding2VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "ONBOARDING2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Onboarding2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
