package com.application.app.modules.splashscreen.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SplashScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtQueezy: String? = MyApp.getInstance().resources.getString(R.string.lbl_queezy)

)
