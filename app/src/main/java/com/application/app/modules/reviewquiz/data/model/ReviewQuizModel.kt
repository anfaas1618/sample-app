package com.application.app.modules.reviewquiz.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ReviewQuizModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateQuiz: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_create_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTECH5QUIZZE: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tech_5_quizze)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRemoteWorkToo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_remote_work_too)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTakeThisBasic: String? =
      MyApp.getInstance().resources.getString(R.string.msg_take_this_basic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtQuestions: String? = MyApp.getInstance().resources.getString(R.string.lbl_questions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhichMathemati: String? =
      MyApp.getInstance().resources.getString(R.string.msg_which_mathemati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMultipleChoice: String? =
      MyApp.getInstance().resources.getString(R.string.msg_multiple_choice)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBadRomanceWas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bad_romance_was)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTrueOrFalse: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_true_or_false)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt3: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhatIsTheNam: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_is_the_nam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTypeAnswer: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_type_answer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtT: String? = MyApp.getInstance().resources.getString(R.string.lbl_t)

)
