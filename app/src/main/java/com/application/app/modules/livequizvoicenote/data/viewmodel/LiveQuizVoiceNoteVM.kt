package com.application.app.modules.livequizvoicenote.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.livequizvoicenote.`data`.model.LiveQuizVoiceNoteModel
import org.koin.core.KoinComponent

public class LiveQuizVoiceNoteVM : ViewModel(), KoinComponent {
  public val liveQuizVoiceNoteModel: MutableLiveData<LiveQuizVoiceNoteModel> =
      MutableLiveData(LiveQuizVoiceNoteModel())

  public var navArguments: Bundle? = null
}
