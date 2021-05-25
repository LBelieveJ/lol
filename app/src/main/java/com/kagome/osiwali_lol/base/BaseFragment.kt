package com.kagome.osiwali_lol.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

/**
 * Fragment 基类
 * Created  on 2021/5/21 14:48
 *  @author: Osiwali
 */
abstract class BaseFragment<T : ViewDataBinding, VM : BaseViewModel> : Fragment() {


    var dataBinding by autoCleared<T>()


    private lateinit var viewModel: VM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate(inflater, getLayoutId(), container, false, null)

        viewModel = ViewModelProvider(this).get(getViewModelClass())

        onCreateView(dataBinding?.root)
        return dataBinding?.root
    }


    abstract fun onCreateView(mainView: View?)

    abstract fun getLayoutId(): Int

    open fun getViewModel() = viewModel

    /**
     * ViewModel Class
     */
    abstract fun getViewModelClass(): Class<VM>

}