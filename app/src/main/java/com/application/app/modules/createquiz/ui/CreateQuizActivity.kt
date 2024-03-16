package com.application.app.modules.createquiz.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityCreateQuizBinding
import com.application.app.modules.createquiz.`data`.viewmodel.CreateQuizVM
import kotlin.String
import kotlin.Unit

public class CreateQuizActivity :
    BaseActivity<ActivityCreateQuizBinding>(R.layout.activity_create_quiz) {
  private val viewModel: CreateQuizVM by viewModels<CreateQuizVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createQuizVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "CREATE_QUIZ_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateQuizActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
