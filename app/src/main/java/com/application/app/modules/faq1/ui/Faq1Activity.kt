package com.application.app.modules.faq1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityFaq1Binding
import com.application.app.modules.faq1.`data`.viewmodel.Faq1VM
import kotlin.String
import kotlin.Unit

public class Faq1Activity : BaseActivity<ActivityFaq1Binding>(R.layout.activity_faq1) {
  private val viewModel: Faq1VM by viewModels<Faq1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.faq1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "FAQ1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Faq1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
