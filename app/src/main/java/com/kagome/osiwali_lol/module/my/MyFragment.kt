package com.kagome.osiwali_lol.module.my

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kagome.osiwali_lol.databinding.FragmentMyBinding
import com.kagome.osiwali_lol.databinding.FragmentPlayerBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * 我的
 */
@AndroidEntryPoint
class MyFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMyBinding.inflate(inflater, container, false)

        return binding.root
    }
}