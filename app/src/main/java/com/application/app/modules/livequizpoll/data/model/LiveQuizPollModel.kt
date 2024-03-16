package com.application.app.modules.livequizpoll.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LiveQuizPollModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt25: String? = MyApp.getInstance().resources.getString(R.string.lbl_252)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt6: String? = MyApp.getInstance().resources.getString(R.string.lbl_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtQUESTION8OF1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_question_8_of_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhatIsTheBes: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_is_the_bes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtManchesterUnit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_manchester_unit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt92: String? = MyApp.getInstance().resources.getString(R.string.lbl_92)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etLeedsUnitedValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etFulhamValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etLeicesterCityValue: String? = null
)
