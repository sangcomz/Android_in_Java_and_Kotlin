package xyz.sangcomz.android_in_java_and_kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        hello.setText("Hello, world!") // Instead of findView(R.id.textView) as TextView
//        print("Hello Kotlin");
    }
}
