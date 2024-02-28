package com.uptrain.app.modules.register.`data`.model

import com.uptrain.app.R
import com.uptrain.app.appcomponents.di.MyApp
import kotlin.String

data class RegisterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNgk: String? = MyApp.getInstance().resources.getString(R.string.lbl_ng_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTnhtrngsc: String? = MyApp.getInstance().resources.getString(R.string.msg_t_nh_tr_ng_s_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTingvi: String? = MyApp.getInstance().resources.getString(R.string.lbl_t_i_ng_v_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIukhondch: String? = MyApp.getInstance().resources.getString(R.string.msg_i_u_kho_n_d_ch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtV: String? = MyApp.getInstance().resources.getString(R.string.lbl_v)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChnhschbo: String? = MyApp.getInstance().resources.getString(R.string.msg_ch_nh_s_ch_b_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyOneValue: String? = null
)
