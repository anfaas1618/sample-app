package com.application.app.modules.settings.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Settings1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtACCOUNT: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUpdateProfile: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_update_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUpdateUsername: String? =
      MyApp.getInstance().resources.getString(R.string.msg_update_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtChangeEmailAd: String? =
      MyApp.getInstance().resources.getString(R.string.msg_change_email_ad)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMadiasyahooco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_madias_yahoo_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtChangePassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLastChange1Y: String? =
      MyApp.getInstance().resources.getString(R.string.msg_last_change_1_y)

)
