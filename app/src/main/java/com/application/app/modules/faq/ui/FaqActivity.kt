package com.application.app.modules.faq.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityFaqBinding
import com.application.app.modules.faq.`data`.viewmodel.FaqVM
import kotlin.String
import kotlin.Unit

public class FaqActivity : BaseActivity<ActivityFaqBinding>(R.layout.activity_faq) {
  private val viewModel: FaqVM by viewModels<FaqVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.faqVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "FAQ_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FaqActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
