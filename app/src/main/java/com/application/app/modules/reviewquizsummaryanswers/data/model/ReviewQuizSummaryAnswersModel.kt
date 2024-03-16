package com.application.app.modules.reviewquizsummaryanswers.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ReviewQuizSummaryAnswersModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtReviewAnswers: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_review_answers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtQUIZNAME: String? = MyApp.getInstance().resources.getString(R.string.lbl_quiz_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEnglishPremier: String? =
      MyApp.getInstance().resources.getString(R.string.msg_english_premier)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt810: String? = MyApp.getInstance().resources.getString(R.string.lbl_8_102)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYouAnswered8: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_answered_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourAnswers: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_your_answers)

)
