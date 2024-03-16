package com.application.app.modules.createquizchoosecategory.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class CreateQuizChooseCategoryModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtChooseCategory: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_choose_category)

)
