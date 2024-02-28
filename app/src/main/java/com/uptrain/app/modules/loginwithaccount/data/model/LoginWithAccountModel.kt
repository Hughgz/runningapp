package com.uptrain.app.modules.loginwithaccount.`data`.model

import com.uptrain.app.R
import com.uptrain.app.appcomponents.di.MyApp
import kotlin.String

data class LoginWithAccountModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDuytrsckh: String? = MyApp.getInstance().resources.getString(R.string.msg_duy_tr_s_c_kh)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNgnhpn: String? = MyApp.getInstance().resources.getString(R.string.msg_ng_nh_p_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQunmtkhu: String? = MyApp.getInstance().resources.getString(R.string.lbl_qu_n_m_t_kh_u)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHoc: String? = MyApp.getInstance().resources.getString(R.string.lbl_ho_c)
  ,
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
  var etGroupEightValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSevenValue: String? = null
)
