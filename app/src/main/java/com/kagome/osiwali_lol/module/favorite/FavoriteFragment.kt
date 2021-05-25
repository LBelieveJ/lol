package com.kagome.osiwali_lol.module.favorite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kagome.osiwali_lol.R
import com.kagome.osiwali_lol.base.BaseFragment
import com.kagome.osiwali_lol.base.BaseViewModel
import com.kagome.osiwali_lol.databinding.FragmentFavoriteBinding
import com.kagome.osiwali_lol.databinding.FragmentPlayerBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * 收藏
 */
@AndroidEntryPoint
class FavoriteFragment : BaseFragment<FragmentFavoriteBinding,BaseViewModel>() {

    override fun onCreateView(mainView: View?) {

    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_favorite
    }

    override fun getViewModelClass(): Class<BaseViewModel> {
        TODO("Not yet implemented")
    }
}