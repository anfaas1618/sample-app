package com.application.app.modules.livequizvoicenote.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LiveQuizVoiceNoteModel(
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
  public var txt5: String? = MyApp.getInstance().resources.getString(R.string.lbl_5)
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

)
