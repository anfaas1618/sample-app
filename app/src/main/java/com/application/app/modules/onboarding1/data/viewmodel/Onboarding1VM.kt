package com.application.app.modules.onboarding1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.onboarding1.`data`.model.Onboarding1Model
import org.koin.core.KoinComponent

public class Onboarding1VM : ViewModel(), KoinComponent {
  public val onboarding1Model: MutableLiveData<Onboarding1Model> =
      MutableLiveData(Onboarding1Model())

  public var navArguments: Bundle? = null
}
