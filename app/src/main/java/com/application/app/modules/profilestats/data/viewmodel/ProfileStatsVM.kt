package com.application.app.modules.profilestats.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.profilestats.`data`.model.ProfileStats1RowModel
import com.application.app.modules.profilestats.`data`.model.ProfileStats2RowModel
import com.application.app.modules.profilestats.`data`.model.ProfileStatsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class ProfileStatsVM : ViewModel(), KoinComponent {
  public val profileStatsModel: MutableLiveData<ProfileStatsModel> =
      MutableLiveData(ProfileStatsModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup1687List: MutableLiveData<MutableList<ProfileStats1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup1643List: MutableLiveData<MutableList<ProfileStats2RowModel>> =
      MutableLiveData(mutableListOf())
}
