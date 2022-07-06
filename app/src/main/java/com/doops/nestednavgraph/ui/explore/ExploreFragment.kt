package com.doops.nestednavgraph.ui.explore

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.doops.nestednavgraph.R
import com.doops.nestednavgraph.databinding.FragmentCartBinding
import com.doops.nestednavgraph.databinding.FragmentExploreBinding
import com.doops.nestednavgraph.utils.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ExploreFragment : BaseFragment<FragmentExploreBinding, ExploreViewModel>() {
    override val layoutId: Int = R.layout.fragment_explore

    override val viewModel: ExploreViewModel by viewModels()

    override fun onReady(savedInstanceState: Bundle?) {

    }
}