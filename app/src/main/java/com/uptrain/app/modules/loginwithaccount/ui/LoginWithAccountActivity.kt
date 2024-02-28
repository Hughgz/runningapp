package com.uptrain.app.modules.loginwithaccount.ui

import androidx.activity.viewModels
import com.uptrain.app.R
import com.uptrain.app.appcomponents.base.BaseActivity
import com.uptrain.app.databinding.ActivityLoginWithAccountBinding
import com.uptrain.app.modules.homecontainer.ui.HomeContainerActivity
import com.uptrain.app.modules.loginwithaccount.`data`.viewmodel.LoginWithAccountVM
import kotlin.String
import kotlin.Unit

class LoginWithAccountActivity :
    BaseActivity<ActivityLoginWithAccountBinding>(R.layout.activity_login_with_account) {
  private val viewModel: LoginWithAccountVM by viewModels<LoginWithAccountVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginWithAccountVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageImageEleven.setOnClickListener {
      val destIntent = HomeContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_WITH_ACCOUNT_ACTIVITY"

  }
}
