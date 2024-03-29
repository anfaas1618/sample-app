package com.application.app.modules.quizdetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityQuizDetailsBinding
import com.application.app.modules.quizdetails.`data`.viewmodel.QuizDetailsVM
import kotlin.String
import kotlin.Unit

public class QuizDetailsActivity :
    BaseActivity<ActivityQuizDetailsBinding>(R.layout.activity_quiz_details) {
  private val viewModel: QuizDetailsVM by viewModels<QuizDetailsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.quizDetailsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "QUIZ_DETAILS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, QuizDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
