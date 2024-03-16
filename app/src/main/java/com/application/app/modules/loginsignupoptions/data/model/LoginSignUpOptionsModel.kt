package com.application.app.modules.loginsignupoptions.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LoginSignUpOptionsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtQueezy: String? = MyApp.getInstance().resources.getString(R.string.lbl_queezy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoginOrSignU: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_or_sign_u)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoginOrCreate: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_or_create)

)
