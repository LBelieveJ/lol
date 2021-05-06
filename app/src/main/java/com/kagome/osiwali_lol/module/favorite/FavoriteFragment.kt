package com.kagome.osiwali_lol.module.favorite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kagome.osiwali_lol.databinding.FragmentFavoriteBinding
import com.kagome.osiwali_lol.databinding.FragmentPlayerBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * 收藏
 */
@AndroidEntryPoint
class FavoriteFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFavoriteBinding.inflate(inflater, container, false)

        return binding.root
    }
}