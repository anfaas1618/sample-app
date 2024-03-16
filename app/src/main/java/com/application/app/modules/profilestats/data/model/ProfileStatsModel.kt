package com.application.app.modules.profilestats.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ProfileStatsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtMadelynDias: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_madelyn_dias)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBadge: String? = MyApp.getInstance().resources.getString(R.string.lbl_badge)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStats: String? = MyApp.getInstance().resources.getString(R.string.lbl_stats)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMonthly: String? = MyApp.getInstance().resources.getString(R.string.lbl_monthly)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYouHavePlayed: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_have_played)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt3750: String? = MyApp.getInstance().resources.getString(R.string.lbl_37_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtQuizPlayed: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_quiz_played)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTopPerformance: String? =
      MyApp.getInstance().resources.getString(R.string.msg_top_performance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMath: String? = MyApp.getInstance().resources.getString(R.string.lbl_math)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSports: String? = MyApp.getInstance().resources.getString(R.string.lbl_sports)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMusic: String? = MyApp.getInstance().resources.getString(R.string.lbl_music)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt100: String? = MyApp.getInstance().resources.getString(R.string.lbl_100)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt75: String? = MyApp.getInstance().resources.getString(R.string.lbl_75)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt50: String? = MyApp.getInstance().resources.getString(R.string.lbl_502)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt25: String? = MyApp.getInstance().resources.getString(R.string.lbl_25)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt0: String? = MyApp.getInstance().resources.getString(R.string.lbl_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt310Questions: String? =
      MyApp.getInstance().resources.getString(R.string.msg_3_10_questions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt810Questions: String? =
      MyApp.getInstance().resources.getString(R.string.msg_8_10_questions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt610Questions: String? =
      MyApp.getInstance().resources.getString(R.string.msg_6_10_questions)

)
