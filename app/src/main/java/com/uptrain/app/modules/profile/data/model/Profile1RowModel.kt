package com.uptrain.app.modules.profile.`data`.model

import com.uptrain.app.R
import com.uptrain.app.appcomponents.di.MyApp
import kotlin.String

data class Profile1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_ch_y_g_n_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_25_02_2024)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKilometsCounterOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_2_kilomets)

)
