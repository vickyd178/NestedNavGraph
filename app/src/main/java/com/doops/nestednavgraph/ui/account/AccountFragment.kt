package com.doops.nestednavgraph.ui.account

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.doops.nestednavgraph.R
import com.doops.nestednavgraph.databinding.FragmentAccountBinding
import com.doops.nestednavgraph.utils.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AccountFragment : BaseFragment<FragmentAccountBinding, AccountViewModel>() {
    override val layoutId: Int = R.layout.fragment_account

    override val viewModel: AccountViewModel by viewModels()

    override fun onReady(savedInstanceState: Bundle?) {

    }
}