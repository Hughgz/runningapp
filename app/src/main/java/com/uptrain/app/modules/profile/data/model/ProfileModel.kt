package com.uptrain.app.modules.profile.`data`.model

import com.uptrain.app.R
import com.uptrain.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTrangcnhn: String? = MyApp.getInstance().resources.getString(R.string.lbl_trang_c_nh_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_minh_hieu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubtitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_ng_i_ch_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.msg_ch_nh_s_a_trang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleSix: String? = MyApp.getInstance().resources.getString(R.string.msg_s_d_m_so_v_i_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYaxis: String? = MyApp.getInstance().resources.getString(R.string.lbl_s_d_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtXaxis: String? = MyApp.getInstance().resources.getString(R.string.lbl_th_i_gian)
  ,
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
