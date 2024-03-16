package com.application.app.modules.signupenterpassword.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SignUpEnterPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhatsYourPas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_s_your_pas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMustBeAtLeas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_must_be_at_leas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2Of3: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_of_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etYourPasswordValue: String? = null
)
