package com.uteev.convertoruteev.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.uteev.convertoruteev.R
import com.uteev.convertoruteev.ViewPagerAdapter


class RootFragment : Fragment() {

    private var ctx : Context? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        ctx = context
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_root, container, false)
        val viewPager = view.findViewById<ViewPager2>(R.id.view_pager)
        val tabLayout = view.findViewById<TabLayout>(R.id.tab_layout)

        viewPager.adapter = ViewPagerAdapter(ctx as FragmentActivity)
        tabLayout.tabIconTint = null

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when(position) {
                0 -> {
                    tab.setIcon(R.drawable.baseline_attach_money_24)
                }
                1 -> {
                    tab.setIcon(R.drawable.round_add_24)
                }
            }
        }.attach()

        return view
    }

}