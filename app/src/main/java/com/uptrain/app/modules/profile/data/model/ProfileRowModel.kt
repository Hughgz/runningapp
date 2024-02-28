package com.uptrain.app.modules.profile.`data`.model

import com.uptrain.app.R
import com.uptrain.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_tu_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtData: String? = MyApp.getInstance().resources.getString(R.string.lbl_30)

)
