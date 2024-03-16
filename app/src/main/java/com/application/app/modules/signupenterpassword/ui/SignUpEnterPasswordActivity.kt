package com.application.app.modules.signupenterpassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySignUpEnterPasswordBinding
import com.application.app.modules.signupenterpassword.`data`.viewmodel.SignUpEnterPasswordVM
import kotlin.String
import kotlin.Unit

public class SignUpEnterPasswordActivity :
    BaseActivity<ActivitySignUpEnterPasswordBinding>(R.layout.activity_sign_up_enter_password) {
  private val viewModel: SignUpEnterPasswordVM by viewModels<SignUpEnterPasswordVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpEnterPasswordVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "SIGN_UP_ENTER_PASSWORD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpEnterPasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
