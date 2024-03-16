package com.application.app.modules.livequizvoicenoteanswerexplanation.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLiveQuizVoiceNoteAnswerExplanationBinding
import com.application.app.modules.livequizvoicenoteanswerexplanation.`data`.viewmodel.LiveQuizVoiceNoteAnswerExplanationVM
import kotlin.String
import kotlin.Unit

public class LiveQuizVoiceNoteAnswerExplanationActivity :
    BaseActivity<ActivityLiveQuizVoiceNoteAnswerExplanationBinding>(R.layout.activity_live_quiz_voice_note_answer_explanation)
    {
  private val viewModel: LiveQuizVoiceNoteAnswerExplanationVM by
      viewModels<LiveQuizVoiceNoteAnswerExplanationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.liveQuizVoiceNoteAnswerExplanationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "LIVE_QUIZ_VOICE_NOTE_ANSWER_EXPLANATION_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LiveQuizVoiceNoteAnswerExplanationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
