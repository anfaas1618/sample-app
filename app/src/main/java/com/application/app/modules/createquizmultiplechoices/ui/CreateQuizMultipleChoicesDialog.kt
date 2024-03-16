package com.application.app.modules.createquizmultiplechoices.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseDialogFragment
import com.application.app.databinding.DialogCreateQuizMultipleChoicesBinding
import com.application.app.modules.createquizmultiplechoices.`data`.viewmodel.CreateQuizMultipleChoicesVM
import kotlin.String
import kotlin.Unit

public class CreateQuizMultipleChoicesDialog :
    BaseDialogFragment<DialogCreateQuizMultipleChoicesBinding>(R.layout.dialog_create_quiz_multiple_choices)
    {
  private val viewModel: CreateQuizMultipleChoicesVM by viewModels<CreateQuizMultipleChoicesVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.createQuizMultipleChoicesVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "CREATE_QUIZ_MULTIPLE_CHOICES_DIALOG"
  }
}
