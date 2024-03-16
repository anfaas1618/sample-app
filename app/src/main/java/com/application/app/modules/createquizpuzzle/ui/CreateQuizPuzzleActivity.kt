package com.application.app.modules.createquizpuzzle.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityCreateQuizPuzzleBinding
import com.application.app.modules.createquizpuzzle.`data`.viewmodel.CreateQuizPuzzleVM
import kotlin.String
import kotlin.Unit

public class CreateQuizPuzzleActivity :
    BaseActivity<ActivityCreateQuizPuzzleBinding>(R.layout.activity_create_quiz_puzzle) {
  private val viewModel: CreateQuizPuzzleVM by viewModels<CreateQuizPuzzleVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createQuizPuzzleVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "CREATE_QUIZ_PUZZLE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateQuizPuzzleActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
