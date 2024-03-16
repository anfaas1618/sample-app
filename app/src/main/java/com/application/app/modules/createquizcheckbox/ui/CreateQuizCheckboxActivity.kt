package com.application.app.modules.createquizcheckbox.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityCreateQuizCheckboxBinding
import com.application.app.modules.createquizcheckbox.`data`.viewmodel.CreateQuizCheckboxVM
import kotlin.String
import kotlin.Unit

public class CreateQuizCheckboxActivity :
    BaseActivity<ActivityCreateQuizCheckboxBinding>(R.layout.activity_create_quiz_checkbox) {
  private val viewModel: CreateQuizCheckboxVM by viewModels<CreateQuizCheckboxVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createQuizCheckboxVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "CREATE_QUIZ_CHECKBOX_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateQuizCheckboxActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
