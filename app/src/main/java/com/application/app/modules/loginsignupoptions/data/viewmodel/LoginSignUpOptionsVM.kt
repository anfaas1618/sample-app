package com.application.app.modules.loginsignupoptions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.loginsignupoptions.`data`.model.LoginSignUpOptionsModel
import org.koin.core.KoinComponent

public class LoginSignUpOptionsVM : ViewModel(), KoinComponent {
  public val loginSignUpOptionsModel: MutableLiveData<LoginSignUpOptionsModel> =
      MutableLiveData(LoginSignUpOptionsModel())

  public var navArguments: Bundle? = null
}
