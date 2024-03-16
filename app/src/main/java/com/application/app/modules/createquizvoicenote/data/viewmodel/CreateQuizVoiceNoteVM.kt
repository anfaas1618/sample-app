package com.application.app.modules.createquizvoicenote.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.createquizvoicenote.`data`.model.CreateQuizVoiceNoteModel
import org.koin.core.KoinComponent

public class CreateQuizVoiceNoteVM : ViewModel(), KoinComponent {
  public val createQuizVoiceNoteModel: MutableLiveData<CreateQuizVoiceNoteModel> =
      MutableLiveData(CreateQuizVoiceNoteModel())

  public var navArguments: Bundle? = null
}
