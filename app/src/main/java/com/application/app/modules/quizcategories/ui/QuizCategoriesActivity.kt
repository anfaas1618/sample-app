package com.application.app.modules.quizcategories.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityQuizCategoriesBinding
import com.application.app.modules.quizcategories.`data`.model.QuizCategories1RowModel
import com.application.app.modules.quizcategories.`data`.viewmodel.QuizCategoriesVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class QuizCategoriesActivity :
    BaseActivity<ActivityQuizCategoriesBinding>(R.layout.activity_quiz_categories) {
  private val viewModel: QuizCategoriesVM by viewModels<QuizCategoriesVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGroup2132Adapter =
    RecyclerGroup2132Adapter(viewModel.recyclerGroup2132List.value?:mutableListOf())
    binding.recyclerGroup2132.adapter = recyclerGroup2132Adapter
    recyclerGroup2132Adapter.setOnItemClickListener(
    object : RecyclerGroup2132Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : QuizCategories1RowModel) {
        onClickRecyclerGroup2132(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup2132List.observe(this) {
      recyclerGroup2132Adapter.updateData(it)
    }
    binding.quizCategoriesVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup2132(
    view: View,
    position: Int,
    item: QuizCategories1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "QUIZ_CATEGORIES_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, QuizCategoriesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
