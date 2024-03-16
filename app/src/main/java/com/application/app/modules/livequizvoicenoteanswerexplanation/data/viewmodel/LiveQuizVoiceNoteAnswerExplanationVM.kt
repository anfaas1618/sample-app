package com.application.app.modules.livequizvoicenoteanswerexplanation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.livequizvoicenoteanswerexplanation.`data`.model.LiveQuizVoiceNoteAnswerExplanationModel
import org.koin.core.KoinComponent

public class LiveQuizVoiceNoteAnswerExplanationVM : ViewModel(), KoinComponent {
  public val liveQuizVoiceNoteAnswerExplanationModel:
      MutableLiveData<LiveQuizVoiceNoteAnswerExplanationModel> =
      MutableLiveData(LiveQuizVoiceNoteAnswerExplanationModel())

  public var navArguments: Bundle? = null
}
