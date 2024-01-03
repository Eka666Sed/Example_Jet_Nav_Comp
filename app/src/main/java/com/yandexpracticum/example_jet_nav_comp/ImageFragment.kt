package com.yandexpracticum.example_jet_nav_comp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.yandexpracticum.example_jet_nav_comp.databinding.FragmentImageBinding

class ImageFragment : Fragment() {

    companion object {
        private const val ARGS_IMAGE = "image"

        fun createArgs(imageResId: Int): Bundle =
            bundleOf(ARGS_IMAGE to imageResId)
    }

    private lateinit var binding: FragmentImageBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentImageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.image.setImageResource(requireArguments().getInt(ARGS_IMAGE))

        binding.goToStartButton.setOnClickListener {
            findNavController().popBackStack(R.id.startFragment, false)
        }
        binding.back.setOnClickListener{
            findNavController().navigateUp()
        }
    }
}