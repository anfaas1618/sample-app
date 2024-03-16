package com.application.app.modules.reviewquiz.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ReviewQuiz1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt4: String? = MyApp.getInstance().resources.getString(R.string.lbl_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhoWroteTheS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_who_wrote_the_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtVoiceNote: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_voice_note)

)
