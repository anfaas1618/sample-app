package com.application.app.modules.invitefriends.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityInviteFriendsBinding
import com.application.app.modules.invitefriends.`data`.viewmodel.InviteFriendsVM
import kotlin.String
import kotlin.Unit

public class InviteFriendsActivity :
    BaseActivity<ActivityInviteFriendsBinding>(R.layout.activity_invite_friends) {
  private val viewModel: InviteFriendsVM by viewModels<InviteFriendsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.inviteFriendsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "INVITE_FRIENDS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, InviteFriendsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
