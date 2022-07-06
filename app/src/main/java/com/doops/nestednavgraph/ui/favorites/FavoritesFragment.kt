package com.doops.nestednavgraph.ui.favorites

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.doops.nestednavgraph.R
import com.doops.nestednavgraph.databinding.FragmentCartBinding
import com.doops.nestednavgraph.databinding.FragmentFavoritesBinding
import com.doops.nestednavgraph.utils.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavoritesFragment : BaseFragment<FragmentFavoritesBinding, FavoritesViewModel>() {
    override val layoutId: Int = R.layout.fragment_favorites

    override val viewModel: FavoritesViewModel by viewModels()

    override fun onReady(savedInstanceState: Bundle?) {

    }
}