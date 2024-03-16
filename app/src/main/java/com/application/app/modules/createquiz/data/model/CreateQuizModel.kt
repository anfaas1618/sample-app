package com.application.app.modules.createquiz.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class CreateQuizModel(
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
  public var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtQuizCategory: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_quiz_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_description2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterQuizTitlValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etChooseQuizCatValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterQuizDescValue: String? = null
)
