package com.application.app.modules.profiledetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.profiledetails.`data`.model.ProfileDetails1RowModel
import com.application.app.modules.profiledetails.`data`.model.ProfileDetails2RowModel
import com.application.app.modules.profiledetails.`data`.model.ProfileDetailsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class ProfileDetailsVM : ViewModel(), KoinComponent {
  public val profileDetailsModel: MutableLiveData<ProfileDetailsModel> =
      MutableLiveData(ProfileDetailsModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup1623List: MutableLiveData<MutableList<ProfileDetails1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup1624List: MutableLiveData<MutableList<ProfileDetails2RowModel>> =
      MutableLiveData(mutableListOf())
}
