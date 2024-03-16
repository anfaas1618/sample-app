package com.application.app.modules.livequizvoicenote1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.livequizvoicenote1.`data`.model.LiveQuizVoiceNote1Model
import org.koin.core.KoinComponent

public class LiveQuizVoiceNote1VM : ViewModel(), KoinComponent {
  public val liveQuizVoiceNote1Model: MutableLiveData<LiveQuizVoiceNote1Model> =
      MutableLiveData(LiveQuizVoiceNote1Model())

  public var navArguments: Bundle? = null
}
