package com.uptrain.app.modules.home.`data`.model

import com.uptrain.app.R
import com.uptrain.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChouserBn: String? = MyApp.getInstance().resources.getString(R.string.msg_ch_o_user_b_n)

)
