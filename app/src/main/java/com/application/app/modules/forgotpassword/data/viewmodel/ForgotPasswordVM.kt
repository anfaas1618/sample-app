package com.application.app.modules.forgotpassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.forgotpassword.`data`.model.ForgotPasswordModel
import org.koin.core.KoinComponent

public class ForgotPasswordVM : ViewModel(), KoinComponent {
  public val forgotPasswordModel: MutableLiveData<ForgotPasswordModel> =
      MutableLiveData(ForgotPasswordModel())

  public var navArguments: Bundle? = null
}
