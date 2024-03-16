package com.application.app.modules.signupenteremail.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SignUpEnterEmailModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhatsYourEma: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_s_your_ema)
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
  public var txt1Of3: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_of_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etYourEmailAddrValue: String? = null
)
