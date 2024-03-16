package com.application.app.modules.login.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.login.`data`.model.LoginModel
import org.koin.core.KoinComponent

public class LoginVM : ViewModel(), KoinComponent {
  public val loginModel: MutableLiveData<LoginModel> = MutableLiveData(LoginModel())

  public var navArguments: Bundle? = null
}
