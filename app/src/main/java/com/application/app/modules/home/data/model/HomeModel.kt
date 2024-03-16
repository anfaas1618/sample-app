package com.application.app.modules.home.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtGOODMORNING: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_good_morning)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMadelynDias: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_madelyn_dias)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRECENTQUIZ: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recent_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtABasicMusicQ: String? =
      MyApp.getInstance().resources.getString(R.string.msg_a_basic_music_q)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt65: String? = MyApp.getInstance().resources.getString(R.string.lbl_65)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFEATURED: String? = MyApp.getInstance().resources.getString(R.string.lbl_featured)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFindFriends: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_find_friends)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTakePartInCh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_take_part_in_ch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLiveQuizzes: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_live_quizzes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)

)
