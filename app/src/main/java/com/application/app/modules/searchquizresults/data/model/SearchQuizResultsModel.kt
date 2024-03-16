package com.application.app.modules.searchquizresults.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SearchQuizResultsModel(
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
  public var txtQuiz1: String? = MyApp.getInstance().resources.getString(R.string.lbl_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFriends1: String? = MyApp.getInstance().resources.getString(R.string.lbl_friends)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMarenWorkman: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_maren_workman)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt325Points: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_325_points)
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
  public var txtManuelaLipshut: String? =
      MyApp.getInstance().resources.getString(R.string.msg_manuela_lipshut)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt437Points: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_437_points)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etMaValue: String? = null
)
