package com.application.app.modules.searchquizresults.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.searchquizresults.`data`.model.SearchQuizResults1RowModel
import com.application.app.modules.searchquizresults.`data`.model.SearchQuizResultsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class SearchQuizResultsVM : ViewModel(), KoinComponent {
  public val searchQuizResultsModel: MutableLiveData<SearchQuizResultsModel> =
      MutableLiveData(SearchQuizResultsModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup2068List: MutableLiveData<MutableList<SearchQuizResults1RowModel>> =
      MutableLiveData(mutableListOf())
}
