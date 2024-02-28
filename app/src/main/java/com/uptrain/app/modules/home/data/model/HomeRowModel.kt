package com.uptrain.app.modules.home.`data`.model

import com.uptrain.app.R
import com.uptrain.app.appcomponents.di.MyApp
import kotlin.String

data class HomeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSbc: String? = MyApp.getInstance().resources.getString(R.string.lbl_s_b_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_100)

)
