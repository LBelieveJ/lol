package com.kagome.osiwali_lol.module.player

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kagome.osiwali_lol.R
import com.kagome.osiwali_lol.base.BaseFragment
import com.kagome.osiwali_lol.base.BaseViewModel
import com.kagome.osiwali_lol.databinding.FragmentPlayerBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * 选手
 */
@AndroidEntryPoint
class ClashPlayerFragment : BaseFragment<FragmentPlayerBinding,BaseViewModel>() {
    override fun onCreateView(mainView: View?) {

    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_player
    }

    override fun getViewModelClass(): Class<BaseViewModel> {
        TODO("Not yet implemented")
    }
}