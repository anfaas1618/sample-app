package com.application.app.modules.createquizvoicenote.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityCreateQuizVoiceNoteBinding
import com.application.app.modules.createquizvoicenote.`data`.viewmodel.CreateQuizVoiceNoteVM
import kotlin.String
import kotlin.Unit

public class CreateQuizVoiceNoteActivity :
    BaseActivity<ActivityCreateQuizVoiceNoteBinding>(R.layout.activity_create_quiz_voice_note) {
  private val viewModel: CreateQuizVoiceNoteVM by viewModels<CreateQuizVoiceNoteVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createQuizVoiceNoteVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "CREATE_QUIZ_VOICE_NOTE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateQuizVoiceNoteActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
