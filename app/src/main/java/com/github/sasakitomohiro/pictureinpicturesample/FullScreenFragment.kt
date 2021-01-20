package com.github.sasakitomohiro.pictureinpicturesample

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.github.sasakitomohiro.pictureinpicturesample.databinding.FragmentFullScreenBinding

class FullScreenFragment : Fragment(R.layout.fragment_full_screen) {
    private var _binding: FragmentFullScreenBinding? = null
    private val binding: FragmentFullScreenBinding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = DataBindingUtil.bind(view)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}
