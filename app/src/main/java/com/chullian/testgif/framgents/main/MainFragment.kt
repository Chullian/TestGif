package com.chullian.testgif.framgents.main

import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.SimpleItemAnimator
import com.chullian.testgif.R
import com.chullian.testgif.data.GiphyItem
import com.chullian.testgif.databinding.FragmentMainBinding
import com.chullian.testgif.viewBinding
import dagger.hilt.android.AndroidEntryPoint


/**
 * Created by binMammootty on 27/10/2022.
 */


@AndroidEntryPoint
class MainFragment : Fragment(R.layout.fragment_main) {
    val binding by viewBinding(FragmentMainBinding::bind)
    val vm: MainVM by viewModels()
    val adapter = GiphyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vm.fetchGifs()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()

        observeUi()
    }

    private fun observeUi() = viewLifecycleOwner.lifecycleScope.launchWhenCreated {
        vm.state.collect {
            showOrHideProgress(it.progress)
            showGifs(it.items)
        }
    }

    private fun showGifs(items: List<GiphyItem>) {
        adapter.itmes = items
    }

    private fun showOrHideProgress(progress: Boolean) {
        binding.progressContainer.setOnClickListener { }
        when (progress) {
            true -> binding.progressContainer.visibility = VISIBLE
            false -> binding.progressContainer.visibility = GONE
        }
    }

    private fun setupViews() = with(binding) {
        productList.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = this@MainFragment.adapter
            (itemAnimator as SimpleItemAnimator).supportsChangeAnimations = false
        }
    }

}