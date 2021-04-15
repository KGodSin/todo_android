package com.kimhyuk.test

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController

import com.kimhyuk.test.viewmodels.BlankViewModel;
import com.kimhyuk.test.databinding.BlankFragmentBinding

class BlankFragment : Fragment() {

    companion object {
        fun newInstance() = BlankFragment()
    }

    private lateinit var viewModel: BlankViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: BlankFragmentBinding =
            DataBindingUtil.inflate(layoutInflater,R.layout.blank_fragment, container, false)
        viewModel = ViewModelProviders.of(this).get(BlankViewModel::class.java)

        context ?: return binding.root

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

                // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button).setOnClickListener {
//            findNavController().navigate(R.id.action_BlankFragment_to_FirstFragment)
            viewModel.test.set("changed!!")
        }
    }

}
