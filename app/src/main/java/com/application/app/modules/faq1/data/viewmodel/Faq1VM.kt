package com.application.app.modules.faq1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.faq1.`data`.model.Faq1Model
import org.koin.core.KoinComponent

public class Faq1VM : ViewModel(), KoinComponent {
  public val faq1Model: MutableLiveData<Faq1Model> = MutableLiveData(Faq1Model())

  public var navArguments: Bundle? = null
}
