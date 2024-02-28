package com.uptrain.app.modules.loginwithaccount.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.uptrain.app.modules.loginwithaccount.`data`.model.LoginWithAccountModel
import org.koin.core.KoinComponent

class LoginWithAccountVM : ViewModel(), KoinComponent {
  val loginWithAccountModel: MutableLiveData<LoginWithAccountModel> =
      MutableLiveData(LoginWithAccountModel())

  var navArguments: Bundle? = null
}
