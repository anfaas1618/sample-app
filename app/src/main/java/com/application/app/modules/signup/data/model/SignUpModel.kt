package com.application.app.modules.signup.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUpWithEm: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_em)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUpWithGo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_go)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUpWithFa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_fa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAlreadyHaveAn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtByContinuing: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_continuing)

)
