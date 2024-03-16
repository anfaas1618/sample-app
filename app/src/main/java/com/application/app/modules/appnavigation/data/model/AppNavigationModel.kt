package com.application.app.modules.appnavigation.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt83InviteFriends: String? =
      MyApp.getInstance().resources.getString(R.string.msg_8_3_invite_frie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt82FAQ: String? = MyApp.getInstance().resources.getString(R.string.lbl_8_2_faq)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt81FAQ: String? = MyApp.getInstance().resources.getString(R.string.lbl_8_1_faq)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt8Settings: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_8_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt62ProfileDetails: String? =
      MyApp.getInstance().resources.getString(R.string.msg_6_2_profile_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt61ProfileStats: String? =
      MyApp.getInstance().resources.getString(R.string.msg_6_1_profile_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt6ProfileBadge: String? =
      MyApp.getInstance().resources.getString(R.string.msg_6_profile_ba)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt59ReviewQuizSummaryAnswers: String? =
      MyApp.getInstance().resources.getString(R.string.msg_5_9_review_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt58QuizCompleted: String? =
      MyApp.getInstance().resources.getString(R.string.msg_5_8_quiz_comple)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt57LiveQuizPuzzle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_5_7_live_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt56LiveQuizPoll: String? =
      MyApp.getInstance().resources.getString(R.string.msg_5_6_live_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt55LiveQuizCheckboxes: String? =
      MyApp.getInstance().resources.getString(R.string.msg_5_5_live_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt542LiveQuizVoiceNoteAnswerExplanation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_5_4_2_live_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt541LiveQuizVoiceNote: String? =
      MyApp.getInstance().resources.getString(R.string.msg_5_4_1_live_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt54LiveQuizVoiceNote: String? =
      MyApp.getInstance().resources.getString(R.string.msg_5_4_live_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt53LiveQuizTypeAnswer: String? =
      MyApp.getInstance().resources.getString(R.string.msg_5_3_live_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt52LiveQuizTrueOrFalse: String? =
      MyApp.getInstance().resources.getString(R.string.msg_5_2_live_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt511LiveQuizMultipleChoicesAnswersExplanation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_5_1_1_live_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt51LiveQuizMultipleChoices: String? =
      MyApp.getInstance().resources.getString(R.string.msg_5_1_live_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt5QuizDetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_5_quiz_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt49ReviewQuiz: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_4_9_review_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt48CreateQuizPuzzle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_4_8_create_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt47CreateQuizPoll: String? =
      MyApp.getInstance().resources.getString(R.string.msg_4_7_create_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt46CreateQuizCheckbox: String? =
      MyApp.getInstance().resources.getString(R.string.msg_4_6_create_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt45CreateQuizVoiceNote: String? =
      MyApp.getInstance().resources.getString(R.string.msg_4_5_create_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt44CreateQuizTypeAnswer: String? =
      MyApp.getInstance().resources.getString(R.string.msg_4_4_create_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt43CreateQuizTrueOrFalse: String? =
      MyApp.getInstance().resources.getString(R.string.msg_4_3_create_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt42CreateQuizMultipleChoices: String? =
      MyApp.getInstance().resources.getString(R.string.msg_4_2_create_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt41CreateQuizChooseCategory: String? =
      MyApp.getInstance().resources.getString(R.string.msg_4_1_create_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt4CreateQuiz: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_4_create_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt33SearchQuizResults: String? =
      MyApp.getInstance().resources.getString(R.string.msg_3_3_search_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt32SearchQuiz: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_3_2_search_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt31QuizCategories: String? =
      MyApp.getInstance().resources.getString(R.string.msg_3_1_quiz_catego)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt3Home: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt243SignUpEnterUsername: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2_4_3_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt242SignUpEnterPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2_4_2_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt241SignUpEnterEmail: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2_4_1_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt24SignUp: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_2_4_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt23SetNewPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2_3_set_new_pas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt22ForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2_2_forgot_pass)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt21Login: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_1_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2LoginSignUpOptions: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2_login_sign)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt11Onboarding3: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_1_onboarding)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt11Onboarding2: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_1_onboarding2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt11Onboarding1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_1_onboarding3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1SplashScreen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_splash_scree)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt73LeaderboardAllTimeFull: String? =
      MyApp.getInstance().resources.getString(R.string.msg_7_3_leaderboard)

)
