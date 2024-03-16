package com.application.app.modules.createquizpoll.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class CreateQuizPollModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateQuiz: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_create_quiz)
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
  public var txt7: String? = MyApp.getInstance().resources.getString(R.string.lbl_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt8: String? = MyApp.getInstance().resources.getString(R.string.lbl_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt10: String? = MyApp.getInstance().resources.getString(R.string.lbl_10)
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
  public var txtPoll: String? = MyApp.getInstance().resources.getString(R.string.lbl_poll)
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
  public var etEnterYourQuesValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etAddChoiceAnswValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etAddChoiceAnsw1Value: String? = null
)
