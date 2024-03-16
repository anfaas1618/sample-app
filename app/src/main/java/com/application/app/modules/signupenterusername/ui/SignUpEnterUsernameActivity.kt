package com.application.app.modules.signupenterusername.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySignUpEnterUsernameBinding
import com.application.app.modules.signupenterusername.`data`.viewmodel.SignUpEnterUsernameVM
import kotlin.String
import kotlin.Unit

public class SignUpEnterUsernameActivity :
    BaseActivity<ActivitySignUpEnterUsernameBinding>(R.layout.activity_sign_up_enter_username) {
  private val viewModel: SignUpEnterUsernameVM by viewModels<SignUpEnterUsernameVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpEnterUsernameVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "SIGN_UP_ENTER_USERNAME_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpEnterUsernameActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
