package com.application.app.modules.login.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoginWithGoog: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_with_goog)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoginWithFace: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_with_face)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOR: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
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
  public var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtByContinuing: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_continuing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etYourEmailAddrValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etYourPasswordValue: String? = null
)
