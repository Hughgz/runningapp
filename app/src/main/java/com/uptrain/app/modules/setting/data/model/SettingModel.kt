package com.uptrain.app.modules.setting.`data`.model

import com.uptrain.app.R
import com.uptrain.app.appcomponents.di.MyApp
import kotlin.String

data class SettingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCit: String? = MyApp.getInstance().resources.getString(R.string.lbl_c_i_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThngtintik: String? = MyApp.getInstance().resources.getString(R.string.msg_th_ng_tin_t_i_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKtnivng: String? = MyApp.getInstance().resources.getString(R.string.msg_k_t_n_i_v_ng)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNgnhpvb: String? = MyApp.getInstance().resources.getString(R.string.msg_ng_nh_p_v_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQuynringt: String? = MyApp.getInstance().resources.getString(R.string.lbl_quy_n_ri_ng_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCitvthn: String? = MyApp.getInstance().resources.getString(R.string.msg_c_i_t_v_th_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNgnng: String? = MyApp.getInstance().resources.getString(R.string.lbl_ng_n_ng)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrungtmhtr: String? = MyApp.getInstance().resources.getString(R.string.msg_trung_t_m_h_tr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIukhonUpTr: String? = MyApp.getInstance().resources.getString(R.string.msg_i_u_kho_n_uptr)

)
