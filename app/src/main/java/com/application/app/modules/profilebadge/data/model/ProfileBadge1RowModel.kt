package com.application.app.modules.profilebadge.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ProfileBadge1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPOINTS: String? = MyApp.getInstance().resources.getString(R.string.lbl_points)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt590: String? = MyApp.getInstance().resources.getString(R.string.lbl_590)

)
