package com.application.app.modules.createquizvoicenote.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class CreateQuizVoiceNoteModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateQuiz: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_create_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddCoverImage: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_cover_image)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt20Sec: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_sec)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtVoiceNote: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_voice_note)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddQuestion: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_question)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt3: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt4: String? = MyApp.getInstance().resources.getString(R.string.lbl_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt5: String? = MyApp.getInstance().resources.getString(R.string.lbl_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt6: String? = MyApp.getInstance().resources.getString(R.string.lbl_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt8: String? = MyApp.getInstance().resources.getString(R.string.lbl_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt9: String? = MyApp.getInstance().resources.getString(R.string.lbl_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterYourQuesValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etAddVoiceAnsweValue: String? = null
)
