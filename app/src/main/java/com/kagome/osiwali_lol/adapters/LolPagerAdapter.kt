package com.kagome.osiwali_lol.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kagome.osiwali_lol.module.player.ClashPlayerFragment
import com.kagome.osiwali_lol.module.favorite.FavoriteFragment
import com.kagome.osiwali_lol.module.my.MyFragment
import com.kagome.osiwali_lol.module.ranking.RankingFragment

const val RANKING_PAGE_INDEX = 0
const val PLAYER_PAGE_INDEX = 1
const val FAVOURITE_PAGE_INDEX = 2
const val MY_PAGE_INDEX = 3

/**
 * 首页viewpager适配器
 */
class LolPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    private val tabFragmentCreators: Map<Int, () -> Fragment> = mapOf(
        RANKING_PAGE_INDEX to { RankingFragment() },
        PLAYER_PAGE_INDEX to { ClashPlayerFragment() },
        FAVOURITE_PAGE_INDEX to { FavoriteFragment() },
        MY_PAGE_INDEX to { MyFragment() }
    )

    override fun getItemCount(): Int {
        return tabFragmentCreators.size
    }

    override fun createFragment(position: Int): Fragment {
        return tabFragmentCreators[position]?.invoke() ?: throw IndexOutOfBoundsException()
    }
}