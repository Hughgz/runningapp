package com.uptrain.app.modules.homecontainer.`data`.model

import com.uptrain.app.R
import com.uptrain.app.appcomponents.di.MyApp
import kotlin.String

data class HomeContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTrangch: String? = MyApp.getInstance().resources.getString(R.string.lbl_trang_ch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCnhn: String? = MyApp.getInstance().resources.getString(R.string.lbl_c_nh_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThngbo: String? = MyApp.getInstance().resources.getString(R.string.lbl_th_ng_b_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCit: String? = MyApp.getInstance().resources.getString(R.string.lbl_c_i_t)

)
