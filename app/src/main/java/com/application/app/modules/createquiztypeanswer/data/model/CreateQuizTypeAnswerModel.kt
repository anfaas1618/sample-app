package com.application.app.modules.createquiztypeanswer.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class CreateQuizTypeAnswerModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateQuiz: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_create_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
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
  public var txtTypeAnswer: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_type_answer)
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
  public var etAddAnswerValue: String? = null
)
