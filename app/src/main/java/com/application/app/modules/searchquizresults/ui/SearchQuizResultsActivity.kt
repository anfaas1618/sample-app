package com.application.app.modules.searchquizresults.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySearchQuizResultsBinding
import com.application.app.modules.searchquizresults.`data`.model.SearchQuizResults1RowModel
import com.application.app.modules.searchquizresults.`data`.viewmodel.SearchQuizResultsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class SearchQuizResultsActivity :
    BaseActivity<ActivitySearchQuizResultsBinding>(R.layout.activity_search_quiz_results) {
  private val viewModel: SearchQuizResultsVM by viewModels<SearchQuizResultsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGroup2068Adapter =
    RecyclerGroup2068Adapter(viewModel.recyclerGroup2068List.value?:mutableListOf())
    binding.recyclerGroup2068.adapter = recyclerGroup2068Adapter
    recyclerGroup2068Adapter.setOnItemClickListener(
    object : RecyclerGroup2068Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SearchQuizResults1RowModel) {
        onClickRecyclerGroup2068(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup2068List.observe(this) {
      recyclerGroup2068Adapter.updateData(it)
    }
    binding.searchQuizResultsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup2068(
    view: View,
    position: Int,
    item: SearchQuizResults1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "SEARCH_QUIZ_RESULTS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchQuizResultsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
