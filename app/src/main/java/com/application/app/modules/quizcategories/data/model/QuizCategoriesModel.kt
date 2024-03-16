package com.application.app.modules.quizcategories.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class QuizCategoriesModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDiscover: String? = MyApp.getInstance().resources.getString(R.string.lbl_discover)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTravelTriviaQ: String? =
      MyApp.getInstance().resources.getString(R.string.msg_travel_trivia_q)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMusic5Quizz: String? =
      MyApp.getInstance().resources.getString(R.string.msg_music_5_quizz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCategories: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_categories)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTopRankOfThe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_top_rank_of_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBrandonMatrovs: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_brandon_matrovs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt124Points: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_124_points)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etQuizCategorieValue: String? = null
)
