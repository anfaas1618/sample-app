package com.application.app.modules.profiledetails.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ProfileDetails2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtVs: String? = MyApp.getInstance().resources.getString(R.string.lbl_vs2)

)
