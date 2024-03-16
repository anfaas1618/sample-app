package com.application.app.modules.onboarding3.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Onboarding3Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTakePartInCh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_take_part_in_ch2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAlreadyHaveAn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)

)
