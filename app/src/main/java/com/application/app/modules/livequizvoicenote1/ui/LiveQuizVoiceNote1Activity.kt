package com.application.app.modules.livequizvoicenote1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLiveQuizVoiceNote1Binding
import com.application.app.modules.livequizvoicenote1.`data`.viewmodel.LiveQuizVoiceNote1VM
import kotlin.String
import kotlin.Unit

public class LiveQuizVoiceNote1Activity :
    BaseActivity<ActivityLiveQuizVoiceNote1Binding>(R.layout.activity_live_quiz_voice_note1) {
  private val viewModel: LiveQuizVoiceNote1VM by viewModels<LiveQuizVoiceNote1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.liveQuizVoiceNote1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "LIVE_QUIZ_VOICE_NOTE1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LiveQuizVoiceNote1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
