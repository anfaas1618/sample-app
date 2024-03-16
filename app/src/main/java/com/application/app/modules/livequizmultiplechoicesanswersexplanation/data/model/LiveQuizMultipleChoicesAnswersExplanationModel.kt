package com.application.app.modules.livequizmultiplechoicesanswersexplanation.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LiveQuizMultipleChoicesAnswersExplanationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAnswersExplana: String? =
      MyApp.getInstance().resources.getString(R.string.msg_answers_explana)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtQUESTION3OF1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_question_3_of_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhichPlayerSc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_which_player_sc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSELECTEDANSWER: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_selected_answer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCORRECTANSWER: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_correct_answer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSadioMane: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_sadio_mane)
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
  public var txtSouthamptonsS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_southampton_s_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etRobinVanPersiValue: String? = null
)
