package com.application.app.modules.createquizmultiplechoices1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityCreateQuizMultipleChoices1Binding
import com.application.app.modules.createquizmultiplechoices1.`data`.model.CreateQuizMultipleChoices2RowModel
import com.application.app.modules.createquizmultiplechoices1.`data`.viewmodel.CreateQuizMultipleChoices1VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class CreateQuizMultipleChoices1Activity :
    BaseActivity<ActivityCreateQuizMultipleChoices1Binding>(R.layout.activity_create_quiz_multiple_choices1)
    {
  private val viewModel: CreateQuizMultipleChoices1VM by viewModels<CreateQuizMultipleChoices1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGroup1957Adapter =
    RecyclerGroup1957Adapter(viewModel.recyclerGroup1957List.value?:mutableListOf())
    binding.recyclerGroup1957.adapter = recyclerGroup1957Adapter
    recyclerGroup1957Adapter.setOnItemClickListener(
    object : RecyclerGroup1957Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      CreateQuizMultipleChoices2RowModel) {
        onClickRecyclerGroup1957(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup1957List.observe(this) {
      recyclerGroup1957Adapter.updateData(it)
    }
    binding.createQuizMultipleChoices1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup1957(
    view: View,
    position: Int,
    item: CreateQuizMultipleChoices2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "CREATE_QUIZ_MULTIPLE_CHOICES1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateQuizMultipleChoices1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
