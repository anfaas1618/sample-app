package com.application.app.modules.livequizvoicenote1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LiveQuizVoiceNote1Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt20: String? = MyApp.getInstance().resources.getString(R.string.lbl_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt8: String? = MyApp.getInstance().resources.getString(R.string.lbl_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtQUESTION6OF1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_question_6_of_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHowToPronounc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_how_to_pronounc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHoldToSpeak: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_hold_to_speak)

)
