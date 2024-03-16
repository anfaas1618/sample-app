package com.application.app.modules.signupenteremail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.signupenteremail.`data`.model.SignUpEnterEmailModel
import org.koin.core.KoinComponent

public class SignUpEnterEmailVM : ViewModel(), KoinComponent {
  public val signUpEnterEmailModel: MutableLiveData<SignUpEnterEmailModel> =
      MutableLiveData(SignUpEnterEmailModel())

  public var navArguments: Bundle? = null
}
