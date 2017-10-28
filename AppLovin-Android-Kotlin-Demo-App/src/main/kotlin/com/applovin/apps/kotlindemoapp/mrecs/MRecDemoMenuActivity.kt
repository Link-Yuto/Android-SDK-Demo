package com.applovin.apps.kotlindemoapp.mrecs

import android.content.Intent
import com.applovin.apps.kotlindemoapp.DemoMenuActivity
import com.applovin.apps.kotlindemoapp.DemoMenuItem

/**
 * Created by monica on 7/24/17.
 */

class MRecDemoMenuActivity : DemoMenuActivity() {
    override fun getListViewContents(): Array<DemoMenuItem> = arrayOf(
            DemoMenuItem("Programmatic", "Programmatically creating an instance of it", Intent(this, MRecProgrammaticActivity::class.java)),
            DemoMenuItem("Layout Editor", "Create an MRec from the layout editor", Intent(this, MRecLayoutEditorActivity::class.java))
    )
}
