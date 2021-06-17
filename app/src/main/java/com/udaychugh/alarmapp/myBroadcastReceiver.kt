package com.udaychugh.alarmapp

import android.app.Notification
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast


class myBroadcastReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent!!.action.equals("com.udaychugh.alarmapp")){
            val b=intent.extras
            val notifyMe=Notifications()
            notifyMe.Notify(context!!, b!!.getString("message")!!, 10)
        }
        else if(intent!!.action.equals("android.intent.action.BOOT_COMPLETED")){
            val saveData = SaveData(context!!)
            saveData.setAlarm()
        }
    }

}
