package com.application.app.modules.livequizmultiplechoices.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLiveQuizMultipleChoicesBinding
import com.application.app.modules.livequizmultiplechoices.`data`.viewmodel.LiveQuizMultipleChoicesVM
import kotlin.String
import kotlin.Unit

public class LiveQuizMultipleChoicesActivity :
    BaseActivity<ActivityLiveQuizMultipleChoicesBinding>(R.layout.activity_live_quiz_multiple_choices)
    {
  private val viewModel: LiveQuizMultipleChoicesVM by viewModels<LiveQuizMultipleChoicesVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.liveQuizMultipleChoicesVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "LIVE_QUIZ_MULTIPLE_CHOICES_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LiveQuizMultipleChoicesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
