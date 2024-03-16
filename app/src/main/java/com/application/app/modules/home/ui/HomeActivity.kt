package com.application.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityHomeBinding
import com.application.app.modules.home.`data`.model.Home1RowModel
import com.application.app.modules.home.`data`.viewmodel.HomeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerQuizzesAdapter =
    RecyclerQuizzesAdapter(viewModel.recyclerQuizzesList.value?:mutableListOf())
    binding.recyclerQuizzes.adapter = recyclerQuizzesAdapter
    recyclerQuizzesAdapter.setOnItemClickListener(
    object : RecyclerQuizzesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Home1RowModel) {
        onClickRecyclerQuizzes(view, position, item)
      }
    }
    )
    viewModel.recyclerQuizzesList.observe(this) {
      recyclerQuizzesAdapter.updateData(it)
    }
    binding.homeVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerQuizzes(
    view: View,
    position: Int,
    item: Home1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "HOME_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
