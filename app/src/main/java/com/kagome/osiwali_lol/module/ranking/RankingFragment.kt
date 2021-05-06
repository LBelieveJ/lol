package com.kagome.osiwali_lol.module.ranking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kagome.osiwali_lol.databinding.FragmentPlayerBinding
import com.kagome.osiwali_lol.databinding.FragmentRankingBinding
import dagger.hilt.android.AndroidEntryPoint



/**
 * 召唤师排行榜
 */
@AndroidEntryPoint
class RankingFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentRankingBinding.inflate(inflater, container, false)


        return binding.root
    }
}