package com.application.app.modules.reviewquizsummaryanswers.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityReviewQuizSummaryAnswersBinding
import com.application.app.modules.reviewquizsummaryanswers.`data`.model.ReviewQuizSummaryAnswers1RowModel
import com.application.app.modules.reviewquizsummaryanswers.`data`.model.ReviewQuizSummaryAnswers2RowModel
import com.application.app.modules.reviewquizsummaryanswers.`data`.viewmodel.ReviewQuizSummaryAnswersVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ReviewQuizSummaryAnswersActivity :
    BaseActivity<ActivityReviewQuizSummaryAnswersBinding>(R.layout.activity_review_quiz_summary_answers)
    {
  private val viewModel: ReviewQuizSummaryAnswersVM by viewModels<ReviewQuizSummaryAnswersVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGroup1780Adapter =
    RecyclerGroup1780Adapter(viewModel.recyclerGroup1780List.value?:mutableListOf())
    binding.recyclerGroup1780.adapter = recyclerGroup1780Adapter
    recyclerGroup1780Adapter.setOnItemClickListener(
    object : RecyclerGroup1780Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ReviewQuizSummaryAnswers1RowModel) {
        onClickRecyclerGroup1780(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup1780List.observe(this) {
      recyclerGroup1780Adapter.updateData(it)
    }
    val recyclerGroup1781Adapter =
    RecyclerGroup1781Adapter(viewModel.recyclerGroup1781List.value?:mutableListOf())
    binding.recyclerGroup1781.adapter = recyclerGroup1781Adapter
    recyclerGroup1781Adapter.setOnItemClickListener(
    object : RecyclerGroup1781Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ReviewQuizSummaryAnswers2RowModel) {
        onClickRecyclerGroup1781(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup1781List.observe(this) {
      recyclerGroup1781Adapter.updateData(it)
    }
    binding.reviewQuizSummaryAnswersVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup1780(
    view: View,
    position: Int,
    item: ReviewQuizSummaryAnswers1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup1781(
    view: View,
    position: Int,
    item: ReviewQuizSummaryAnswers2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "REVIEW_QUIZ_SUMMARY_ANSWERS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReviewQuizSummaryAnswersActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
