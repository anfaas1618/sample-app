package com.application.app.modules.searchquiz.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SearchQuizModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDiscover: String? = MyApp.getInstance().resources.getString(R.string.lbl_discover)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTop: String? = MyApp.getInstance().resources.getString(R.string.lbl_top)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtQuiz: String? = MyApp.getInstance().resources.getString(R.string.lbl_quiz)
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
  public var txtFriends: String? = MyApp.getInstance().resources.getString(R.string.lbl_friends)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRecentSearches: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recent_searches)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtClearAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_clear_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStatisticsMath: String? =
      MyApp.getInstance().resources.getString(R.string.msg_statistics_math)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMath12Quizz: String? =
      MyApp.getInstance().resources.getString(R.string.msg_math_12_quizz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etQuizCategorieValue: String? = null
)
