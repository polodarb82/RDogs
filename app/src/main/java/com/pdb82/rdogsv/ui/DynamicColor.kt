package com.pdb82.rdogsv.ui

import android.app.Application
import com.google.android.material.color.DynamicColors

class DynamicColor: Application() {
    override fun onCreate() {
        // Apply dynamic color
        DynamicColors.applyToActivitiesIfAvailable(this)
        super.onCreate()
    }
}