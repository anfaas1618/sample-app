package com.application.app.modules.faq1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Faq1Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtHelpAndSuppor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_help_and_suppor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHowToLoginOr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_how_to_login_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCanIInviteMy: String? =
      MyApp.getInstance().resources.getString(R.string.msg_can_i_invite_my)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etSearchTopicsOValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etINTROValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etIntroToQueezyValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etCREATEANDTAKEValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etHowToCreateQValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etHowToTakeQuiValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etHowDoIPlayQValue: String? = null
)
