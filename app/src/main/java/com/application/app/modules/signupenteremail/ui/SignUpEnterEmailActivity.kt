package com.application.app.modules.signupenteremail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySignUpEnterEmailBinding
import com.application.app.modules.signupenteremail.`data`.viewmodel.SignUpEnterEmailVM
import kotlin.String
import kotlin.Unit

public class SignUpEnterEmailActivity :
    BaseActivity<ActivitySignUpEnterEmailBinding>(R.layout.activity_sign_up_enter_email) {
  private val viewModel: SignUpEnterEmailVM by viewModels<SignUpEnterEmailVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpEnterEmailVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "SIGN_UP_ENTER_EMAIL_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpEnterEmailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
