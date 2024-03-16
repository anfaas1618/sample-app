package com.application.app.modules.searchquiz.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySearchQuizBinding
import com.application.app.modules.searchquiz.`data`.viewmodel.SearchQuizVM
import kotlin.String
import kotlin.Unit

public class SearchQuizActivity :
    BaseActivity<ActivitySearchQuizBinding>(R.layout.activity_search_quiz) {
  private val viewModel: SearchQuizVM by viewModels<SearchQuizVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.searchQuizVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "SEARCH_QUIZ_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchQuizActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
