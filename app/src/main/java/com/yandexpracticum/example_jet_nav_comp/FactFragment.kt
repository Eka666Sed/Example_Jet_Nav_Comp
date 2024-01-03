package com.yandexpracticum.example_jet_nav_comp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.yandexpracticum.example_jet_nav_comp.databinding.FragmentFactBinding

class FactFragment : Fragment() {

    companion object {
        private const val ARGS_FACT = "fact"

        fun createArgs(fact: String): Bundle =
            bundleOf(ARGS_FACT to fact)
    }

    private lateinit var binding: FragmentFactBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentFactBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fact = requireArguments().getString(ARGS_FACT)

        binding.fact.text = fact

        val imageId = if (fact.equals(getString(R.string.cat_fact))) R.drawable.image_cotton else R.drawable.image_hamster

        binding.imageButton.setOnClickListener {
            findNavController().navigate(R.id.action_factFragment_to_imageFragment,
                ImageFragment.createArgs(imageId))
        }
        binding.back.setOnClickListener{
            findNavController().navigateUp()
        }
    }
}