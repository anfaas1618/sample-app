package com.application.app.modules.signupenterusername.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SignUpEnterUsernameModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateAUserna: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_a_userna)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt3Of3: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_of_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etYourUsernameValue: String? = null
)
