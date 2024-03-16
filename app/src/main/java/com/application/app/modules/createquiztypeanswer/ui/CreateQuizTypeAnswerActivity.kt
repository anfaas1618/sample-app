package com.application.app.modules.createquiztypeanswer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityCreateQuizTypeAnswerBinding
import com.application.app.modules.createquiztypeanswer.`data`.viewmodel.CreateQuizTypeAnswerVM
import kotlin.String
import kotlin.Unit

public class CreateQuizTypeAnswerActivity :
    BaseActivity<ActivityCreateQuizTypeAnswerBinding>(R.layout.activity_create_quiz_type_answer) {
  private val viewModel: CreateQuizTypeAnswerVM by viewModels<CreateQuizTypeAnswerVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createQuizTypeAnswerVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "CREATE_QUIZ_TYPE_ANSWER_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateQuizTypeAnswerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
