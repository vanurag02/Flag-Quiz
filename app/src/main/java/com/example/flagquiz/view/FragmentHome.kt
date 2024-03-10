package com.example.flagquiz.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.flagquiz.R
import com.example.flagquiz.databinding.FragmentHomeBinding
import com.techmania.flagquizwithsqlitedemo.DatabaseCopyHelper

class FragmentHome : Fragment()
{
    lateinit var fragmentHomeBinding : FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View
    {
        fragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false)

        createAndOpenDatabase()

        fragmentHomeBinding.buttonStart.setOnClickListener()
        {
            val direction  = FragmentHomeDirections.actionFragmentHomeToFragmentQuiz()
            this.findNavController().navigate(direction)
        }

        // Inflate the layout for this fragment
        return fragmentHomeBinding.root
    }

    private fun createAndOpenDatabase()
    {
        try
        {
            val helper = DatabaseCopyHelper(requireActivity())
            helper.createDataBase()
            helper.openDataBase()

        }
        catch (e : Exception)
        {
            e.printStackTrace()
        }
    }

}