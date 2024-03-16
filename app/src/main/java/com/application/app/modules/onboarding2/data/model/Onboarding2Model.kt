package com.application.app.modules.onboarding2.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Onboarding2Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFindQuizzesTo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_find_quizzes_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAlreadyHaveAn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)

)
