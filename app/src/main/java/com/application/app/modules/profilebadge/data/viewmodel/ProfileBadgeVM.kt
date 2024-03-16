package com.application.app.modules.profilebadge.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.profilebadge.`data`.model.ProfileBadge1RowModel
import com.application.app.modules.profilebadge.`data`.model.ProfileBadge2RowModel
import com.application.app.modules.profilebadge.`data`.model.ProfileBadgeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class ProfileBadgeVM : ViewModel(), KoinComponent {
  public val profileBadgeModel: MutableLiveData<ProfileBadgeModel> =
      MutableLiveData(ProfileBadgeModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup1763List: MutableLiveData<MutableList<ProfileBadge1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup1701List: MutableLiveData<MutableList<ProfileBadge2RowModel>> =
      MutableLiveData(mutableListOf())
}
