package com.application.app.modules.onboarding3.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityOnboarding3Binding
import com.application.app.modules.onboarding3.`data`.viewmodel.Onboarding3VM
import kotlin.String
import kotlin.Unit

public class Onboarding3Activity :
    BaseActivity<ActivityOnboarding3Binding>(R.layout.activity_onboarding_3) {
  private val viewModel: Onboarding3VM by viewModels<Onboarding3VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboarding3VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "ONBOARDING3ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Onboarding3Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
