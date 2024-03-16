package com.application.app.modules.loginsignupoptions.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLoginSignUpOptionsBinding
import com.application.app.modules.loginsignupoptions.`data`.viewmodel.LoginSignUpOptionsVM
import kotlin.String
import kotlin.Unit

public class LoginSignUpOptionsActivity :
    BaseActivity<ActivityLoginSignUpOptionsBinding>(R.layout.activity_login_sign_up_options) {
  private val viewModel: LoginSignUpOptionsVM by viewModels<LoginSignUpOptionsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginSignUpOptionsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "LOGIN_SIGN_UP_OPTIONS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginSignUpOptionsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
