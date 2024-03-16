package com.application.app.modules.createquiztrueorfalse.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityCreateQuizTrueOrFalseBinding
import com.application.app.modules.createquiztrueorfalse.`data`.viewmodel.CreateQuizTrueOrFalseVM
import kotlin.String
import kotlin.Unit

public class CreateQuizTrueOrFalseActivity :
    BaseActivity<ActivityCreateQuizTrueOrFalseBinding>(R.layout.activity_create_quiz_true_or_false)
    {
  private val viewModel: CreateQuizTrueOrFalseVM by viewModels<CreateQuizTrueOrFalseVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createQuizTrueOrFalseVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "CREATE_QUIZ_TRUE_OR_FALSE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateQuizTrueOrFalseActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
