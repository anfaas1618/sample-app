package com.application.app.modules.livequizvoicenoteanswerexplanation.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LiveQuizVoiceNoteAnswerExplanationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAnswersExplana: String? =
      MyApp.getInstance().resources.getString(R.string.msg_answers_explana)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtQUESTION6OF1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_question_6_of_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHowToPronounc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_how_to_pronounc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtVOICEANSWER: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_voice_answer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtVoychekShe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_voy_chek_she)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEXPLANATION: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_explanation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPronunciationE: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pronunciation_e)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGendermale: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_gender_male)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWordnameorigi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_word_name_origi)

)
