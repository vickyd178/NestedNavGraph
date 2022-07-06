package com.doops.nestednavgraph.ui.account.profile

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.doops.nestednavgraph.R
import com.doops.nestednavgraph.databinding.FragmentAccountBinding
import com.doops.nestednavgraph.databinding.FragmentProfileBinding
import com.doops.nestednavgraph.utils.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment : BaseFragment<FragmentProfileBinding, ProfileViewModel>() {
    override val layoutId: Int = R.layout.fragment_profile
    override val viewModel: ProfileViewModel by viewModels()
    
    override fun onReady(savedInstanceState: Bundle?) {

    }
}