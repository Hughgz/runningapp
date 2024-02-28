package com.uptrain.app.modules.login.`data`.model

import com.uptrain.app.R
import com.uptrain.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNgnhpFaceb: String? = MyApp.getInstance().resources.getString(R.string.msg_ng_nh_p_faceb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNgnhpGoogl: String? = MyApp.getInstance().resources.getString(R.string.msg_ng_nh_p_googl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNgnhptik: String? = MyApp.getInstance().resources.getString(R.string.msg_ng_nh_p_t_i_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBnchacti: String? = MyApp.getInstance().resources.getString(R.string.msg_b_n_ch_a_c_t_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNgk: String? = MyApp.getInstance().resources.getString(R.string.lbl_ng_k2)

)
