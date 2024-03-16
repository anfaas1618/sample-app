package com.application.app.modules.searchquiz.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.searchquiz.`data`.model.SearchQuizModel
import org.koin.core.KoinComponent

public class SearchQuizVM : ViewModel(), KoinComponent {
  public val searchQuizModel: MutableLiveData<SearchQuizModel> = MutableLiveData(SearchQuizModel())

  public var navArguments: Bundle? = null
}
