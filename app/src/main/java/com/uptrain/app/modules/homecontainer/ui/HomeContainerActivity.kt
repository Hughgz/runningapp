package com.uptrain.app.modules.homecontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.uptrain.app.R
import com.uptrain.app.appcomponents.base.BaseActivity
import com.uptrain.app.databinding.ActivityHomeContainerBinding
import com.uptrain.app.extensions.loadFragment
import com.uptrain.app.modules.home.ui.HomeFragment
import com.uptrain.app.modules.homecontainer.`data`.viewmodel.HomeContainerVM
import com.uptrain.app.modules.login.ui.LoginActivity
import com.uptrain.app.modules.notifications.ui.NotificationsActivity
import com.uptrain.app.modules.profile.ui.ProfileActivity
import com.uptrain.app.modules.setting.ui.SettingActivity
import kotlin.String
import kotlin.Unit

class HomeContainerActivity :
    BaseActivity<ActivityHomeContainerBinding>(R.layout.activity_home_container) {
  private val viewModel: HomeContainerVM by viewModels<HomeContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeContainerVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
      val destFragment = HomeFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = HomeFragment.TAG, 
          addToBackStack = false, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }

    override fun setUpClicks(): Unit {
      binding.imageSettings.setOnClickListener {
        val destIntent = SettingActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.imageUser.setOnClickListener {
        val destIntent = ProfileActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.imageNotification.setOnClickListener {
        val destIntent = NotificationsActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.linearColumnhome.setOnClickListener {
        val destFragment = HomeFragment.getInstance(null)
        this.loadFragment(
            R.id.fragmentContainer,
            destFragment,
            bundle = destFragment.arguments, 
            tag = HomeFragment.TAG, 
            addToBackStack = true, 
            add = false, 
            enter = null, 
            exit = null, 
            )
      }
    }

    companion object {
      const val TAG: String = "HOME_CONTAINER_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, HomeContainerActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
