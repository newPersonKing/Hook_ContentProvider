package com.ivydad.module.hookactivity

import android.app.Application
import android.content.Context
import com.ivydad.module.hookactivity.utils.HookUtils


class MyApp : Application() {

    companion object {

        var instance :MyApp? = null

        fun agree(){
            HookUtils.initProvider(instance);
        }
    }

    override fun attachBaseContext(base: Context?) {

        instance = this

        try {
            HookUtils.attachContext()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        super.attachBaseContext(base)

    }

}