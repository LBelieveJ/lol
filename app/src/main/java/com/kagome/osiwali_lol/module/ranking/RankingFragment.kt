package com.kagome.osiwali_lol.module.ranking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.*
import com.kagome.osiwali_lol.R
import com.kagome.osiwali_lol.base.BaseFragment
import com.kagome.osiwali_lol.databinding.FragmentPlayerBinding
import com.kagome.osiwali_lol.databinding.FragmentRankingBinding
import com.kagome.osiwali_lol.viewmodel.SummonerViewModel
import dagger.hilt.android.AndroidEntryPoint


/**
 * 召唤师排行榜
 */
@AndroidEntryPoint
class RankingFragment : BaseFragment<FragmentRankingBinding, SummonerViewModel>() {


    override fun onCreateView(mainView: View?) {

    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_ranking
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getViewModel().getSummonerByName("1234")

        getViewModel().summoner.observe(viewLifecycleOwner, Observer {
            println(it)
        })
    }

    override fun getViewModelClass(): Class<SummonerViewModel> = SummonerViewModel::class.java
}

