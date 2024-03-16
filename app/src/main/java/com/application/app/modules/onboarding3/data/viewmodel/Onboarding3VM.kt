package com.application.app.modules.onboarding3.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.onboarding3.`data`.model.Onboarding3Model
import org.koin.core.KoinComponent

public class Onboarding3VM : ViewModel(), KoinComponent {
  public val onboarding3Model: MutableLiveData<Onboarding3Model> =
      MutableLiveData(Onboarding3Model())

  public var navArguments: Bundle? = null
}
