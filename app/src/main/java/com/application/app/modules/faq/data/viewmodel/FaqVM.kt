package com.application.app.modules.faq.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.faq.`data`.model.FaqModel
import org.koin.core.KoinComponent

public class FaqVM : ViewModel(), KoinComponent {
  public val faqModel: MutableLiveData<FaqModel> = MutableLiveData(FaqModel())

  public var navArguments: Bundle? = null
}
