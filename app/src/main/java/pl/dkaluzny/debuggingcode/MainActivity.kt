package pl.dkaluzny.debuggingcode

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add(10, 12)
    }

    //Todo: Write new function
    //Todo: Write more function
    fun add(firstNum: Int, secondNum: Int) {
        println("Sum is: ${firstNum + secondNum}")
    }

    



}
