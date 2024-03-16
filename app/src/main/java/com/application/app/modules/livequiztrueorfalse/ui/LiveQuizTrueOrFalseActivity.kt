package com.application.app.modules.livequiztrueorfalse.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLiveQuizTrueOrFalseBinding
import com.application.app.modules.livequiztrueorfalse.`data`.viewmodel.LiveQuizTrueOrFalseVM
import kotlin.String
import kotlin.Unit

public class LiveQuizTrueOrFalseActivity :
    BaseActivity<ActivityLiveQuizTrueOrFalseBinding>(R.layout.activity_live_quiz_true_or_false) {
  private val viewModel: LiveQuizTrueOrFalseVM by viewModels<LiveQuizTrueOrFalseVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.liveQuizTrueOrFalseVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "LIVE_QUIZ_TRUE_OR_FALSE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LiveQuizTrueOrFalseActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
