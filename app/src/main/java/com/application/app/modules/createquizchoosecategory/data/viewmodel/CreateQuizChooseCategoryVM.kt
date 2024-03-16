package com.application.app.modules.createquizchoosecategory.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.createquizchoosecategory.`data`.model.CreateQuizChooseCategory1RowModel
import com.application.app.modules.createquizchoosecategory.`data`.model.CreateQuizChooseCategoryModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class CreateQuizChooseCategoryVM : ViewModel(), KoinComponent {
  public val createQuizChooseCategoryModel: MutableLiveData<CreateQuizChooseCategoryModel> =
      MutableLiveData(CreateQuizChooseCategoryModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup1969List: MutableLiveData<MutableList<CreateQuizChooseCategory1RowModel>>
      = MutableLiveData(mutableListOf())
}
