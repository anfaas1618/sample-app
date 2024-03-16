package com.application.app.modules.profilebadge.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ProfileBadgeModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtMadelynDias: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_madelyn_dias)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBadge: String? = MyApp.getInstance().resources.getString(R.string.lbl_badge)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStats: String? = MyApp.getInstance().resources.getString(R.string.lbl_stats)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_details)

)
