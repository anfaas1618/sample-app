package com.application.app.modules.onboarding1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Onboarding1Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateGamified: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_gamified)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAlreadyHaveAn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)

)
