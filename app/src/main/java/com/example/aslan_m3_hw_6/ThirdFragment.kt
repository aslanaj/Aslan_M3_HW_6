package com.example.aslan_m3_hw_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aslan_m3_hw_6.databinding.FragmentSecondBinding
import com.example.aslan_m3_hw_6.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
    private  lateinit var binding: FragmentThirdBinding
    private lateinit var data: Song

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        data = arguments?.getSerializable("Key") as Song
        binding.apply {
            tvSongGet.text = data.songName
            tvSingerGet.text = data.singerName
            tvSongTimeGet.text = data.songTime
        }

    }
}