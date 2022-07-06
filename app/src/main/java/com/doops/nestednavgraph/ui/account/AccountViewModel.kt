package com.doops.nestednavgraph.ui.account

import com.doops.nestednavgraph.utils.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

import javax.inject.Inject

@HiltViewModel
class AccountViewModel @Inject constructor(): BaseViewModel() {


    fun openProfileFragment() {
        navigate(AccountFragmentDirections.actionAccountToProfile())
    }

}