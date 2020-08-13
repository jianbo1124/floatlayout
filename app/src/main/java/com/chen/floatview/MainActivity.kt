package com.chen.floatview

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.chen.floatview.view.FloatLayout
import kotlinx.android.synthetic.main.activity_main.*

/**
 *    @Author : chenjianbo
 *    @Date   : 2020/8/13
 *    @Desc   :
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {


        var mData = arrayListOf<String>()
        for (i in 0..20) {
            var value = ""
            for (j in 0..i) {
                value += j.toString()
            }
            mData.add(value)
        }

        floatLayout.setAdapter(object : FloatLayout.FloatAdapter() {
            override fun getCount(): Int {
                return mData.size
            }

            override fun getLayoutID(): Int {
                return R.layout.item_float
            }

            override fun onBindView(v: View, position: Int) {
                v.findViewById<TextView>(R.id.tv_name).text = mData[position]
            }

        })

    }


}