package com.application.app.modules.livequizmultiplechoices.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LiveQuizMultipleChoicesModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt35: String? = MyApp.getInstance().resources.getString(R.string.lbl_35)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt6: String? = MyApp.getInstance().resources.getString(R.string.lbl_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtQUESTION3OF1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_question_3_of_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhichPlayerSc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_which_player_sc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRobinVanPersi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_robin_van_persi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etSadioManeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etHarryKaneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etChristianBenteValue: String? = null
)
