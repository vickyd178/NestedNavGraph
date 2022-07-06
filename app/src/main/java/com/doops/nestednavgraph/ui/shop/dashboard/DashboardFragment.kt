package com.doops.nestednavgraph.ui.shop.dashboard

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.doops.nestednavgraph.R
import com.doops.nestednavgraph.databinding.FragmentDashboardBinding
import com.doops.nestednavgraph.utils.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DashboardFragment : BaseFragment<FragmentDashboardBinding, DashboardViewModel>() {
    override val layoutId: Int = R.layout.fragment_dashboard

    override val viewModel: DashboardViewModel by viewModels()

    override fun onReady(savedInstanceState: Bundle?) {

    }
}