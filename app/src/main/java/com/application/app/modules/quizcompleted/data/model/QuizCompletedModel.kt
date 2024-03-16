package com.application.app.modules.quizcompleted.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class QuizCompletedModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtGoodJob: String? = MyApp.getInstance().resources.getString(R.string.lbl_good_job)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYouGet80Qui: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_get_80_qui)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAccurationAnsw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_accuration_answ)
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
  public var txt4: String? = MyApp.getInstance().resources.getString(R.string.lbl_4)
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
  public var txt9: String? = MyApp.getInstance().resources.getString(R.string.lbl_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt10: String? = MyApp.getInstance().resources.getString(R.string.lbl_10)

)
