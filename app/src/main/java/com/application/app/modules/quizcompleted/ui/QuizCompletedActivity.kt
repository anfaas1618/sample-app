package com.application.app.modules.quizcompleted.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityQuizCompletedBinding
import com.application.app.modules.quizcompleted.`data`.model.QuizCompleted1RowModel
import com.application.app.modules.quizcompleted.`data`.viewmodel.QuizCompletedVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class QuizCompletedActivity :
    BaseActivity<ActivityQuizCompletedBinding>(R.layout.activity_quiz_completed) {
  private val viewModel: QuizCompletedVM by viewModels<QuizCompletedVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGroup1792Adapter =
    RecyclerGroup1792Adapter(viewModel.recyclerGroup1792List.value?:mutableListOf())
    binding.recyclerGroup1792.adapter = recyclerGroup1792Adapter
    recyclerGroup1792Adapter.setOnItemClickListener(
    object : RecyclerGroup1792Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : QuizCompleted1RowModel) {
        onClickRecyclerGroup1792(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup1792List.observe(this) {
      recyclerGroup1792Adapter.updateData(it)
    }
    binding.quizCompletedVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup1792(
    view: View,
    position: Int,
    item: QuizCompleted1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "QUIZ_COMPLETED_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, QuizCompletedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
