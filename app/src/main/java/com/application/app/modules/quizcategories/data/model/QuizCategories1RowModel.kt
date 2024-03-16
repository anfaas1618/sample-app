package com.application.app.modules.quizcategories.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class QuizCategories1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtMath: String? = MyApp.getInstance().resources.getString(R.string.lbl_math)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt21Quizzes: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_21_quizzes)

)
