package com.application.app.modules.setnewpassword.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SetNewPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNewPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_new_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourNewPasswo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_new_passwo)
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
  public var txtConfirmPasswor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confirm_passwor)

)
