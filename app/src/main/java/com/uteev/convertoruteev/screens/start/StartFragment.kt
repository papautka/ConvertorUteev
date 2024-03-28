package com.uteev.convertoruteev.screens.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.uteev.convertoruteev.R

class StartFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private val viewModel: StartViewModel by viewModels()
    private val adapter = StartAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewStart = inflater.inflate(R.layout.fragment_start, container, false)
        recyclerView = viewStart.findViewById(R.id.rv_start)
        recyclerView.adapter = adapter

        viewModel.getNalMoney()
        viewModel.myMoneyList.observe(viewLifecycleOwner) { list ->
            list.body()?.let { adapter.setMap(it) }
        }

        return viewStart
    }
}
