package com.application.app.modules.createquizpoll.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityCreateQuizPollBinding
import com.application.app.modules.createquizpoll.`data`.viewmodel.CreateQuizPollVM
import kotlin.String
import kotlin.Unit

public class CreateQuizPollActivity :
    BaseActivity<ActivityCreateQuizPollBinding>(R.layout.activity_create_quiz_poll) {
  private val viewModel: CreateQuizPollVM by viewModels<CreateQuizPollVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createQuizPollVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "CREATE_QUIZ_POLL_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateQuizPollActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
