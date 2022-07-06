package com.doops.nestednavgraph.ui.shop.category

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.doops.nestednavgraph.R
import com.doops.nestednavgraph.databinding.FragmentCategoriesBinding
import com.doops.nestednavgraph.databinding.FragmentDashboardBinding
import com.doops.nestednavgraph.utils.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CategoriesFragment : BaseFragment<FragmentCategoriesBinding, CategoriesViewModel>() {
    override val layoutId: Int = R.layout.fragment_categories

    override val viewModel: CategoriesViewModel by viewModels()

    override fun onReady(savedInstanceState: Bundle?) {

    }
}