package com.application.app.modules.setnewpassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.setnewpassword.`data`.model.SetNewPasswordModel
import org.koin.core.KoinComponent

public class SetNewPasswordVM : ViewModel(), KoinComponent {
  public val setNewPasswordModel: MutableLiveData<SetNewPasswordModel> =
      MutableLiveData(SetNewPasswordModel())

  public var navArguments: Bundle? = null
}
