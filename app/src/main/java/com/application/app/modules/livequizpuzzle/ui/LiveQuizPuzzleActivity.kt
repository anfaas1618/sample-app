package com.application.app.modules.livequizpuzzle.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLiveQuizPuzzleBinding
import com.application.app.modules.livequizpuzzle.`data`.viewmodel.LiveQuizPuzzleVM
import kotlin.String
import kotlin.Unit

public class LiveQuizPuzzleActivity :
    BaseActivity<ActivityLiveQuizPuzzleBinding>(R.layout.activity_live_quiz_puzzle) {
  private val viewModel: LiveQuizPuzzleVM by viewModels<LiveQuizPuzzleVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.liveQuizPuzzleVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "LIVE_QUIZ_PUZZLE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LiveQuizPuzzleActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
