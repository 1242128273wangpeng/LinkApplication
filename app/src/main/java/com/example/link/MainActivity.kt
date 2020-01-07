package com.example.link

import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textDeepLink.movementMethod = LinkMovementMethod.getInstance()
        val a1 =
            "<a href='2345://www.2345.com/'>2345://www.2345.com/</a>"
        val cs1 = Html.fromHtml(a1)
        textDeepLink.text = cs1

        textAppLink.movementMethod = LinkMovementMethod.getInstance()
        val a2 =
            "<a href='https://1242128273wangpeng.github.io/applinktest/'>https://1242128273wangpeng.github.io/applinktest/</a>"
        val cs2 = Html.fromHtml(a2)
        textAppLink.text = cs2
    }
}
