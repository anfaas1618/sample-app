package com.application.app.modules.livequizcheckboxes.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLiveQuizCheckboxesBinding
import com.application.app.modules.livequizcheckboxes.`data`.viewmodel.LiveQuizCheckboxesVM
import kotlin.String
import kotlin.Unit

public class LiveQuizCheckboxesActivity :
    BaseActivity<ActivityLiveQuizCheckboxesBinding>(R.layout.activity_live_quiz_checkboxes) {
  private val viewModel: LiveQuizCheckboxesVM by viewModels<LiveQuizCheckboxesVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.liveQuizCheckboxesVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "LIVE_QUIZ_CHECKBOXES_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LiveQuizCheckboxesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
