package com.doops.nestednavgraph.ui.shop.dashboard

import com.doops.nestednavgraph.utils.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor() : BaseViewModel() {


    fun navigateToCategories() {
        navigate(DashboardFragmentDirections.actionDashboardToCategories())
    }
}