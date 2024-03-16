package com.application.app.modules.onboarding2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.onboarding2.`data`.model.Onboarding2Model
import org.koin.core.KoinComponent

public class Onboarding2VM : ViewModel(), KoinComponent {
  public val onboarding2Model: MutableLiveData<Onboarding2Model> =
      MutableLiveData(Onboarding2Model())

  public var navArguments: Bundle? = null
}
