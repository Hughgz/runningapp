package com.uptrain.app.modules.notifications.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.uptrain.app.R
import com.uptrain.app.appcomponents.base.BaseActivity
import com.uptrain.app.databinding.ActivityNotificationsBinding
import com.uptrain.app.modules.homecontainer.ui.HomeContainerActivity
import com.uptrain.app.modules.notifications.`data`.model.NotificationsRowModel
import com.uptrain.app.modules.notifications.`data`.viewmodel.NotificationsVM
import com.uptrain.app.modules.profile.ui.ProfileActivity
import com.uptrain.app.modules.setting.ui.SettingActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationsActivity :
    BaseActivity<ActivityNotificationsBinding>(R.layout.activity_notifications) {
  private val viewModel: NotificationsVM by viewModels<NotificationsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val notificationsAdapter =
    NotificationsAdapter(viewModel.notificationsList.value?:mutableListOf())
    binding.recyclerNotifications.adapter = notificationsAdapter
    notificationsAdapter.setOnItemClickListener(
    object : NotificationsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : NotificationsRowModel) {
        onClickRecyclerNotifications(view, position, item)
      }
    }
    )
    viewModel.notificationsList.observe(this) {
      notificationsAdapter.updateData(it)
    }
    binding.notificationsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageHome.setOnClickListener {
      val destIntent = HomeContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSettings.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerNotifications(
    view: View,
    position: Int,
    item: NotificationsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
