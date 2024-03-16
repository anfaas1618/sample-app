package com.application.app.modules.reviewquiz.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityReviewQuizBinding
import com.application.app.modules.reviewquiz.`data`.model.ReviewQuiz1RowModel
import com.application.app.modules.reviewquiz.`data`.viewmodel.ReviewQuizVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ReviewQuizActivity :
    BaseActivity<ActivityReviewQuizBinding>(R.layout.activity_review_quiz) {
  private val viewModel: ReviewQuizVM by viewModels<ReviewQuizVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGroup1875Adapter =
    RecyclerGroup1875Adapter(viewModel.recyclerGroup1875List.value?:mutableListOf())
    binding.recyclerGroup1875.adapter = recyclerGroup1875Adapter
    recyclerGroup1875Adapter.setOnItemClickListener(
    object : RecyclerGroup1875Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ReviewQuiz1RowModel) {
        onClickRecyclerGroup1875(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup1875List.observe(this) {
      recyclerGroup1875Adapter.updateData(it)
    }
    binding.reviewQuizVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup1875(
    view: View,
    position: Int,
    item: ReviewQuiz1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "REVIEW_QUIZ_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReviewQuizActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
