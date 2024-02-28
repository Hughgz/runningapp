package com.uptrain.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.uptrain.app.R
import com.uptrain.app.appcomponents.base.BaseActivity
import com.uptrain.app.databinding.ActivityLoginBinding
import com.uptrain.app.modules.login.`data`.viewmodel.LoginVM
import com.uptrain.app.modules.register.ui.RegisterActivity
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtNgk.setOnClickListener {
      val destIntent = RegisterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
