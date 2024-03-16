package com.application.app.modules.livequiztypeanswer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLiveQuizTypeAnswerBinding
import com.application.app.modules.livequiztypeanswer.`data`.viewmodel.LiveQuizTypeAnswerVM
import kotlin.String
import kotlin.Unit

public class LiveQuizTypeAnswerActivity :
    BaseActivity<ActivityLiveQuizTypeAnswerBinding>(R.layout.activity_live_quiz_type_answer) {
  private val viewModel: LiveQuizTypeAnswerVM by viewModels<LiveQuizTypeAnswerVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.liveQuizTypeAnswerVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "LIVE_QUIZ_TYPE_ANSWER_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LiveQuizTypeAnswerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
