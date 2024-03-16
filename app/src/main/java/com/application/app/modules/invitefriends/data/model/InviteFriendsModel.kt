package com.application.app.modules.invitefriends.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class InviteFriendsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtInviteFriends: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_invite_friends)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtVS: String? = MyApp.getInstance().resources.getString(R.string.lbl_vs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtInviteFriends1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_invite_friends)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCopyCode: String? = MyApp.getInstance().resources.getString(R.string.lbl_copy_code)

)
