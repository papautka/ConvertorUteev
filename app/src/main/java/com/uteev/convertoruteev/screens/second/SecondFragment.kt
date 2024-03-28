package com.uteev.convertoruteev.screens.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.uteev.convertoruteev.R
import com.uteev.convertoruteev.screens.start.StartAdapter
import com.uteev.convertoruteev.screens.start.StartViewModel
import org.w3c.dom.Text

class SecondFragment : Fragment() {

    private lateinit var textView: TextView
    private val viewModel: SecondViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewSecond = inflater.inflate(R.layout.fragment_second, container, false)
        textView = viewSecond.findViewById(R.id.text_second)
        viewModel.getNalMoney()
        viewModel.myMoneyList.observe(viewLifecycleOwner) { response ->
               response.body()?.let { currencyResponse ->
                   textView.text = currencyResponse.Date ?: "Нет данных"
               }
        }
        return viewSecond
    }


}