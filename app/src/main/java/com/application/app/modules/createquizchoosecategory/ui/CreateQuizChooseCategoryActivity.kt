package com.application.app.modules.createquizchoosecategory.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityCreateQuizChooseCategoryBinding
import com.application.app.modules.createquizchoosecategory.`data`.model.CreateQuizChooseCategory1RowModel
import com.application.app.modules.createquizchoosecategory.`data`.viewmodel.CreateQuizChooseCategoryVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class CreateQuizChooseCategoryActivity :
    BaseActivity<ActivityCreateQuizChooseCategoryBinding>(R.layout.activity_create_quiz_choose_category)
    {
  private val viewModel: CreateQuizChooseCategoryVM by viewModels<CreateQuizChooseCategoryVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGroup1969Adapter =
    RecyclerGroup1969Adapter(viewModel.recyclerGroup1969List.value?:mutableListOf())
    binding.recyclerGroup1969.adapter = recyclerGroup1969Adapter
    recyclerGroup1969Adapter.setOnItemClickListener(
    object : RecyclerGroup1969Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      CreateQuizChooseCategory1RowModel) {
        onClickRecyclerGroup1969(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup1969List.observe(this) {
      recyclerGroup1969Adapter.updateData(it)
    }
    binding.createQuizChooseCategoryVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup1969(
    view: View,
    position: Int,
    item: CreateQuizChooseCategory1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "CREATE_QUIZ_CHOOSE_CATEGORY_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateQuizChooseCategoryActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
