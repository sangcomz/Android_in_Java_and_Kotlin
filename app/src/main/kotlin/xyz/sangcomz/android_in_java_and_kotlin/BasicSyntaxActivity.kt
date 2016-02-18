package xyz.sangcomz.android_in_java_and_kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_basicsyntax.*
import java.util.*

/**
 * Created by sangcomz on 2/18/16.
 */
class BasicSyntaxActivity : AppCompatActivity() {

    var x = 5
    var b = 12

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basicsyntax)

        var args = ArrayList<String>()

        args.add("a")
        args.add("b")
        args.add("c")
        args.add("d")

        var anys = ArrayList<Any>()

        anys.add(1)
        anys.add("Hello")
        anys.add(1L)
        anys.add(true)
        anys.add("Hey")

        for (i in anys.indices)
            cases(anys[i])


        for (i in args.indices)
            println(args[i])

        txt_basic.text = sum(x, b).toString() + " // " + sum_ex(10, 17) + "\n\n" + max_ex(10, 20)
        //        print(sum(1,2));

        unitFun("Hello! Seok Won")

        var i = 0
        while (i < args.size)
            println("While Loop :::: " + args[i++])


    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum_ex(a: Int, b: Int) = a + b

    fun unitFun(str: String) {
        println(str)
    }

    fun max(a: Int, b: Int): Int {
        if (a > b)
            return a
        else
            return b
    }

    fun max_ex(a: Int, b: Int) = if (a > b) a else b

    fun parseInt(str: String): Int? {
        return 10
    }

    fun cases(obj: Any) {
        when (obj) {
            1 -> println("One")
            "Hello" -> println("Greeting")
            is Long -> println("Long")
            !is String -> println("Not a string")
            else -> println("Unknown")
        }
    }


}