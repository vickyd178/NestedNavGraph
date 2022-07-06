package com.doops.nestednavgraph.ui.cart

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.doops.nestednavgraph.R
import com.doops.nestednavgraph.databinding.FragmentAccountBinding
import com.doops.nestednavgraph.databinding.FragmentCartBinding
import com.doops.nestednavgraph.utils.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CartFragment : BaseFragment<FragmentCartBinding, CartViewModel>() {
    override val layoutId: Int = R.layout.fragment_cart

    override val viewModel: CartViewModel by viewModels()

    override fun onReady(savedInstanceState: Bundle?) {

    }
}