package com.application.app.modules.livequizcheckboxes.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LiveQuizCheckboxesModel(
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
  public var txt8: String? = MyApp.getInstance().resources.getString(R.string.lbl_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtQUESTION7OF1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_question_7_of_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhichThreePla: String? =
      MyApp.getInstance().resources.getString(R.string.msg_which_three_pla)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMohamedSalah: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_mohamed_salah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSadioMane: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_sadio_mane)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAubameyang: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_aubameyang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etMarcusRashfordValue: String? = null
)
