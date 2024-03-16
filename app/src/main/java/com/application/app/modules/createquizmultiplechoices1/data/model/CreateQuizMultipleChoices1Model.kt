package com.application.app.modules.createquizmultiplechoices1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class CreateQuizMultipleChoices1Model(
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
  public var txtAddCoverImage: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_cover_image)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt10Sec: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_sec)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMultipleAnswer: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_multiple_answer)
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
  public var txtDuplicate: String? = MyApp.getInstance().resources.getString(R.string.lbl_duplicate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDelete: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterYourQuesValue: String? = null
)
