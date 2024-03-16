package com.application.app.modules.forgotpassword.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ForgotPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtResetPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reset_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEnterYourEmai: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_emai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEmailAddress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_email_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etYourEmailAddrValue: String? = null
)
