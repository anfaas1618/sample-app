package com.application.app.modules.signupenterpassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.signupenterpassword.`data`.model.SignUpEnterPasswordModel
import org.koin.core.KoinComponent

public class SignUpEnterPasswordVM : ViewModel(), KoinComponent {
  public val signUpEnterPasswordModel: MutableLiveData<SignUpEnterPasswordModel> =
      MutableLiveData(SignUpEnterPasswordModel())

  public var navArguments: Bundle? = null
}
