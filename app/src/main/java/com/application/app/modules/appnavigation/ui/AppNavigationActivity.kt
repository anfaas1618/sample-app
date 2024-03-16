package com.application.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAppNavigationBinding
import com.application.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.application.app.modules.createquiz.ui.CreateQuizActivity
import com.application.app.modules.createquizcheckbox.ui.CreateQuizCheckboxActivity
import com.application.app.modules.createquizchoosecategory.ui.CreateQuizChooseCategoryActivity
import com.application.app.modules.createquizmultiplechoices1.ui.CreateQuizMultipleChoices1Activity
import com.application.app.modules.createquizpoll.ui.CreateQuizPollActivity
import com.application.app.modules.createquizpuzzle.ui.CreateQuizPuzzleActivity
import com.application.app.modules.createquiztrueorfalse.ui.CreateQuizTrueOrFalseActivity
import com.application.app.modules.createquiztypeanswer.ui.CreateQuizTypeAnswerActivity
import com.application.app.modules.createquizvoicenote.ui.CreateQuizVoiceNoteActivity
import com.application.app.modules.faq.ui.FaqActivity
import com.application.app.modules.faq1.ui.Faq1Activity
import com.application.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.application.app.modules.home.ui.HomeActivity
import com.application.app.modules.invitefriends.ui.InviteFriendsActivity
import com.application.app.modules.leaderboardalltimefull1.ui.LeaderboardAllTimeFull1Activity
import com.application.app.modules.livequizcheckboxes.ui.LiveQuizCheckboxesActivity
import com.application.app.modules.livequizmultiplechoices.ui.LiveQuizMultipleChoicesActivity
import com.application.app.modules.livequizmultiplechoicesanswersexplanation.ui.LiveQuizMultipleChoicesAnswersExplanationActivity
import com.application.app.modules.livequizpoll.ui.LiveQuizPollActivity
import com.application.app.modules.livequizpuzzle.ui.LiveQuizPuzzleActivity
import com.application.app.modules.livequiztrueorfalse.ui.LiveQuizTrueOrFalseActivity
import com.application.app.modules.livequiztypeanswer.ui.LiveQuizTypeAnswerActivity
import com.application.app.modules.livequizvoicenote.ui.LiveQuizVoiceNoteActivity
import com.application.app.modules.livequizvoicenote1.ui.LiveQuizVoiceNote1Activity
import com.application.app.modules.livequizvoicenoteanswerexplanation.ui.LiveQuizVoiceNoteAnswerExplanationActivity
import com.application.app.modules.login.ui.LoginActivity
import com.application.app.modules.loginsignupoptions.ui.LoginSignUpOptionsActivity
import com.application.app.modules.onboarding1.ui.Onboarding1Activity
import com.application.app.modules.onboarding2.ui.Onboarding2Activity
import com.application.app.modules.onboarding3.ui.Onboarding3Activity
import com.application.app.modules.profilebadge.ui.ProfileBadgeActivity
import com.application.app.modules.profiledetails.ui.ProfileDetailsActivity
import com.application.app.modules.profilestats.ui.ProfileStatsActivity
import com.application.app.modules.quizcategories.ui.QuizCategoriesActivity
import com.application.app.modules.quizcompleted.ui.QuizCompletedActivity
import com.application.app.modules.quizdetails.ui.QuizDetailsActivity
import com.application.app.modules.reviewquiz.ui.ReviewQuizActivity
import com.application.app.modules.reviewquizsummaryanswers.ui.ReviewQuizSummaryAnswersActivity
import com.application.app.modules.searchquiz.ui.SearchQuizActivity
import com.application.app.modules.searchquizresults.ui.SearchQuizResultsActivity
import com.application.app.modules.setnewpassword.ui.SetNewPasswordActivity
import com.application.app.modules.settings.ui.SettingsActivity
import com.application.app.modules.signup.ui.SignUpActivity
import com.application.app.modules.signupenteremail.ui.SignUpEnterEmailActivity
import com.application.app.modules.signupenterpassword.ui.SignUpEnterPasswordActivity
import com.application.app.modules.signupenterusername.ui.SignUpEnterUsernameActivity
import com.application.app.modules.splashscreen.ui.SplashScreenActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linear8Settings.setOnClickListener {
      val destIntent = SettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear82FAQ.setOnClickListener {
      val destIntent = FaqActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear22ForgotPassword.setOnClickListener {
      val destIntent = ForgotPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear33SearchQuizResults.setOnClickListener {
      val destIntent = SearchQuizResultsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear46CreateQuizCheckbox.setOnClickListener {
      val destIntent = CreateQuizCheckboxActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear24SignUp.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear511LiveQuizMultipleChoicesAnswersExplanation.setOnClickListener {
      val destIntent = LiveQuizMultipleChoicesAnswersExplanationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear56LiveQuizPoll.setOnClickListener {
      val destIntent = LiveQuizPollActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear73LeaderboardAllTimeFull.setOnClickListener {
      val destIntent = LeaderboardAllTimeFull1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear31QuizCategories.setOnClickListener {
      val destIntent = QuizCategoriesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear45CreateQuizVoiceNote.setOnClickListener {
      val destIntent = CreateQuizVoiceNoteActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear21Login.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear241SignUpEnterEmail.setOnClickListener {
      val destIntent = SignUpEnterEmailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear52LiveQuizTrueOrFalse.setOnClickListener {
      val destIntent = LiveQuizTrueOrFalseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear54LiveQuizVoiceNote.setOnClickListener {
      val destIntent = LiveQuizVoiceNote1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear4CreateQuiz.setOnClickListener {
      val destIntent = CreateQuizActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear41CreateQuizChooseCategory.setOnClickListener {
      val destIntent = CreateQuizChooseCategoryActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear49ReviewQuiz.setOnClickListener {
      val destIntent = ReviewQuizActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear1SplashScreen.setOnClickListener {
      val destIntent = SplashScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear47CreateQuizPoll.setOnClickListener {
      val destIntent = CreateQuizPollActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear61ProfileStats.setOnClickListener {
      val destIntent = ProfileStatsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear243SignUpEnterUsername.setOnClickListener {
      val destIntent = SignUpEnterUsernameActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear57LiveQuizPuzzle.setOnClickListener {
      val destIntent = LiveQuizPuzzleActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear44CreateQuizTypeAnswer.setOnClickListener {
      val destIntent = CreateQuizTypeAnswerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear3Home.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear11Onboarding3.setOnClickListener {
      val destIntent = Onboarding3Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear542LiveQuizVoiceNoteAnswerExplanation.setOnClickListener {
      val destIntent = LiveQuizVoiceNoteAnswerExplanationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear48CreateQuizPuzzle.setOnClickListener {
      val destIntent = CreateQuizPuzzleActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear58QuizCompleted.setOnClickListener {
      val destIntent = QuizCompletedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear242SignUpEnterPassword.setOnClickListener {
      val destIntent = SignUpEnterPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear11Onboarding2.setOnClickListener {
      val destIntent = Onboarding2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear11Onboarding1.setOnClickListener {
      val destIntent = Onboarding1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear541LiveQuizVoiceNote.setOnClickListener {
      val destIntent = LiveQuizVoiceNoteActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear55LiveQuizCheckboxes.setOnClickListener {
      val destIntent = LiveQuizCheckboxesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear2LoginSignUpOptions.setOnClickListener {
      val destIntent = LoginSignUpOptionsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear6ProfileBadge.setOnClickListener {
      val destIntent = ProfileBadgeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear81FAQ.setOnClickListener {
      val destIntent = Faq1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear5QuizDetails.setOnClickListener {
      val destIntent = QuizDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear43CreateQuizTrueOrFalse.setOnClickListener {
      val destIntent = CreateQuizTrueOrFalseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear51LiveQuizMultipleChoices.setOnClickListener {
      val destIntent = LiveQuizMultipleChoicesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear59ReviewQuizSummaryAnswers.setOnClickListener {
      val destIntent = ReviewQuizSummaryAnswersActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear53LiveQuizTypeAnswer.setOnClickListener {
      val destIntent = LiveQuizTypeAnswerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear23SetNewPassword.setOnClickListener {
      val destIntent = SetNewPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear32SearchQuiz.setOnClickListener {
      val destIntent = SearchQuizActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear62ProfileDetails.setOnClickListener {
      val destIntent = ProfileDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear83InviteFriends.setOnClickListener {
      val destIntent = InviteFriendsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear42CreateQuizMultipleChoices.setOnClickListener {
      val destIntent = CreateQuizMultipleChoices1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
