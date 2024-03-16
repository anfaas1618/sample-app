package com.application.app.modules.signupenterusername.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.signupenterusername.`data`.model.SignUpEnterUsernameModel
import org.koin.core.KoinComponent

public class SignUpEnterUsernameVM : ViewModel(), KoinComponent {
  public val signUpEnterUsernameModel: MutableLiveData<SignUpEnterUsernameModel> =
      MutableLiveData(SignUpEnterUsernameModel())

  public var navArguments: Bundle? = null
}
