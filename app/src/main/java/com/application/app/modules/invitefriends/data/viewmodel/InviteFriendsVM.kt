package com.application.app.modules.invitefriends.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.invitefriends.`data`.model.InviteFriendsModel
import org.koin.core.KoinComponent

public class InviteFriendsVM : ViewModel(), KoinComponent {
  public val inviteFriendsModel: MutableLiveData<InviteFriendsModel> =
      MutableLiveData(InviteFriendsModel())

  public var navArguments: Bundle? = null
}
