package com.application.app.modules.livequizvoicenote.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLiveQuizVoiceNoteBinding
import com.application.app.modules.livequizvoicenote.`data`.viewmodel.LiveQuizVoiceNoteVM
import kotlin.String
import kotlin.Unit

public class LiveQuizVoiceNoteActivity :
    BaseActivity<ActivityLiveQuizVoiceNoteBinding>(R.layout.activity_live_quiz_voice_note) {
  private val viewModel: LiveQuizVoiceNoteVM by viewModels<LiveQuizVoiceNoteVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.liveQuizVoiceNoteVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "LIVE_QUIZ_VOICE_NOTE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LiveQuizVoiceNoteActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
