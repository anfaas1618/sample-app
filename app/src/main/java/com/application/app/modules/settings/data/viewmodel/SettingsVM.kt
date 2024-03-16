package com.application.app.modules.settings.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.settings.`data`.model.Settings1RowModel
import com.application.app.modules.settings.`data`.model.SettingsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class SettingsVM : ViewModel(), KoinComponent {
  public val settingsModel: MutableLiveData<SettingsModel> = MutableLiveData(SettingsModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup461List: MutableLiveData<MutableList<Settings1RowModel>> =
      MutableLiveData(mutableListOf())
}
