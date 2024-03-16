package com.application.app.modules.livequizpoll.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLiveQuizPollBinding
import com.application.app.modules.livequizpoll.`data`.viewmodel.LiveQuizPollVM
import kotlin.String
import kotlin.Unit

public class LiveQuizPollActivity :
    BaseActivity<ActivityLiveQuizPollBinding>(R.layout.activity_live_quiz_poll) {
  private val viewModel: LiveQuizPollVM by viewModels<LiveQuizPollVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.liveQuizPollVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "LIVE_QUIZ_POLL_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LiveQuizPollActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
