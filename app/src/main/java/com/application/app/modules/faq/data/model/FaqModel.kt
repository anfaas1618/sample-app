package com.application.app.modules.faq.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class FaqModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtHelpAndSuppor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_help_and_suppor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtIntroToQueezy: String? =
      MyApp.getInstance().resources.getString(R.string.msg_intro_to_queezy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUpdated1Mo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_updated_1_mo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtQueezyAppsOff: String? =
      MyApp.getInstance().resources.getString(R.string.msg_queezy_apps_off)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWithQueezyYou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_with_queezy_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWatchOn: String? = MyApp.getInstance().resources.getString(R.string.lbl_watch_on)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYouTube: String? = MyApp.getInstance().resources.getString(R.string.lbl_youtube)

)
