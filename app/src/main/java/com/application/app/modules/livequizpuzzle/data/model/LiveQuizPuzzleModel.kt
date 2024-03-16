package com.application.app.modules.livequizpuzzle.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LiveQuizPuzzleModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt40: String? = MyApp.getInstance().resources.getString(R.string.lbl_40)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt3: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtQUESTION9OF1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_question_9_of_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhatDoesUAVS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_does_uav_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUnmanned: String? = MyApp.getInstance().resources.getString(R.string.lbl_unmanned)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAerial: String? = MyApp.getInstance().resources.getString(R.string.lbl_aerial)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt4: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtVehicle: String? = MyApp.getInstance().resources.getString(R.string.lbl_vehicle)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt5: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etUnmannedAerialValue: String? = null
)
