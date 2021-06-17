package com.udaychugh.alarmapp

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TimePicker
import androidx.fragment.app.DialogFragment

class PopTime: DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var myView = inflater!!.inflate(R.layout.pop_item, container, false)

        var buDone = myView.findViewById(R.id.buDone) as Button
        var tpl = myView.findViewById(R.id.tpl) as TimePicker

        buDone.setOnClickListener{
            val ma = activity as MainActivity
            if (Build.VERSION.SDK_INT>=23) {
                ma.SetTime(tpl.hour, tpl.minute)
            } else {
                ma.SetTime(tpl.currentHour, tpl.currentMinute)
            }
            this.dismiss()
        }

        return myView
    }


}