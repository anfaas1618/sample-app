package com.application.app.modules.livequizmultiplechoicesanswersexplanation.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLiveQuizMultipleChoicesAnswersExplanationBinding
import com.application.app.modules.livequizmultiplechoicesanswersexplanation.`data`.viewmodel.LiveQuizMultipleChoicesAnswersExplanationVM
import kotlin.String
import kotlin.Unit

public class LiveQuizMultipleChoicesAnswersExplanationActivity :
    BaseActivity<ActivityLiveQuizMultipleChoicesAnswersExplanationBinding>(R.layout.activity_live_quiz_multiple_choices_answers_explanation)
    {
  private val viewModel: LiveQuizMultipleChoicesAnswersExplanationVM by
      viewModels<LiveQuizMultipleChoicesAnswersExplanationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.liveQuizMultipleChoicesAnswersExplanationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "LIVE_QUIZ_MULTIPLE_CHOICES_ANSWERS_EXPLANATION_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context,
                LiveQuizMultipleChoicesAnswersExplanationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
