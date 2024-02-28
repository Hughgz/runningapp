package com.uptrain.app.modules.profile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.uptrain.app.R
import com.uptrain.app.appcomponents.base.BaseActivity
import com.uptrain.app.databinding.ActivityProfileBinding
import com.uptrain.app.modules.homecontainer.ui.HomeContainerActivity
import com.uptrain.app.modules.notifications.ui.NotificationsActivity
import com.uptrain.app.modules.profile.`data`.model.Profile1RowModel
import com.uptrain.app.modules.profile.`data`.model.ProfileRowModel
import com.uptrain.app.modules.profile.`data`.viewmodel.ProfileVM
import com.uptrain.app.modules.setting.ui.SettingActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileActivity : BaseActivity<ActivityProfileBinding>(R.layout.activity_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val profileAdapter = ProfileAdapter(viewModel.profileList.value?:mutableListOf())
    binding.recyclerProfile.adapter = profileAdapter
    profileAdapter.setOnItemClickListener(
    object : ProfileAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProfileRowModel) {
        onClickRecyclerProfile(view, position, item)
      }
    }
    )
    viewModel.profileList.observe(this) {
      profileAdapter.updateData(it)
    }
    val profile1Adapter = Profile1Adapter(viewModel.profile1List.value?:mutableListOf())
    binding.recyclerProfile1.adapter = profile1Adapter
    profile1Adapter.setOnItemClickListener(
    object : Profile1Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Profile1RowModel) {
        onClickRecyclerProfile1(view, position, item)
      }
    }
    )
    viewModel.profile1List.observe(this) {
      profile1Adapter.updateData(it)
    }
    binding.profileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageHome.setOnClickListener {
      val destIntent = HomeContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageImageTen.setOnClickListener {
      val destIntent = HomeContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSettings.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerProfile(
    view: View,
    position: Int,
    item: ProfileRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerProfile1(
    view: View,
    position: Int,
    item: Profile1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
