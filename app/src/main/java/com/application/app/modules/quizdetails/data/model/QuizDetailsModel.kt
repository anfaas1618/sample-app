package com.application.app.modules.quizdetails.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class QuizDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSPORTS: String? = MyApp.getInstance().resources.getString(R.string.lbl_sports2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBasicTriviaQu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_basic_trivia_qu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt10Questions: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_10_questions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt100Points: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_100_points)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDESCRIPTION: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_description)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAnyTimeIsAG: String? =
      MyApp.getInstance().resources.getString(R.string.msg_any_time_is_a_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBrandonCurtis: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_brandon_curtis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreator: String? = MyApp.getInstance().resources.getString(R.string.lbl_creator)

)
