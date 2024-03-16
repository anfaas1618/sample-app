package com.application.app.modules.createquizcheckboxaddanswer.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseDialogFragment
import com.application.app.databinding.DialogCreateQuizCheckboxAddAnswerBinding
import com.application.app.modules.createquizcheckboxaddanswer.`data`.viewmodel.CreateQuizCheckboxAddAnswerVM
import kotlin.String
import kotlin.Unit

public class CreateQuizCheckboxAddAnswerDialog :
    BaseDialogFragment<DialogCreateQuizCheckboxAddAnswerBinding>(R.layout.dialog_create_quiz_checkbox_add_answer)
    {
  private val viewModel: CreateQuizCheckboxAddAnswerVM by
      viewModels<CreateQuizCheckboxAddAnswerVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.createQuizCheckboxAddAnswerVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "CREATE_QUIZ_CHECKBOX_ADD_ANSWER_DIALOG"
  }
}
