package com.github.sasakitomohiro.pictureinpicturesample

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.github.sasakitomohiro.pictureinpicturesample.databinding.FragmentPipBinding

class PIPFragment : Fragment(R.layout.fragment_pip) {
    private var _binding: FragmentPipBinding? = null
    private val binding: FragmentPipBinding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = DataBindingUtil.bind(view)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    override fun onPictureInPictureModeChanged(isInPictureInPictureMode: Boolean) {
        if (!isInPictureInPictureMode) {
            findNavController().popBackStack()
        }
    }
}
