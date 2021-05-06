package com.kagome.osiwali_lol

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.kagome.osiwali_lol.adapters.*
import com.kagome.osiwali_lol.databinding.FragmentLolViewPagerBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * viewpager fragmentF
 */
@AndroidEntryPoint
class LolViewPagerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentLolViewPagerBinding.inflate(inflater, container, false)
        val tableLayout = binding.tabs
        val viewPager = binding.viewPager

        binding.viewPager.adapter = LolPagerAdapter(this)

        TabLayoutMediator(tableLayout, viewPager) { tab, position ->
            tab.setIcon(getIcon(position))
            tab.text = getTabTitle(position)

        }.attach()

        (activity as AppCompatActivity).setSupportActionBar(binding.toolbar)

        return binding.root
    }


    private fun getTabTitle(position: Int): String? {
        return when (position) {
            RANKING_PAGE_INDEX -> getString(R.string.ranking_title)
            PLAYER_PAGE_INDEX -> getString(R.string.player_title)
            FAVOURITE_PAGE_INDEX -> getString(R.string.favorite_title)
            MY_PAGE_INDEX -> getString(R.string.my_title)
            else -> throw IndexOutOfBoundsException()
        }
    }

    private fun getIcon(position: Int): Int {
        return when (position) {
            RANKING_PAGE_INDEX -> R.drawable.ranking_tab_selector
            PLAYER_PAGE_INDEX -> R.drawable.player_tab_selector
            FAVOURITE_PAGE_INDEX -> R.drawable.favorite_tab_selector
            MY_PAGE_INDEX -> R.drawable.my_tab_selector
            else -> throw IndexOutOfBoundsException()
        }
    }

}