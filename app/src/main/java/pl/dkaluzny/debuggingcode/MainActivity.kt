package pl.dkaluzny.debuggingcode

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "OnPause Started", Toast.LENGTH_LONG).show()
    }

    override fun onPostResume() {
        super.onPostResume()
        Toast.makeText(this, "OnPostResume Started", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        Toast.makeText(this, "OnDestroy Started", Toast.LENGTH_LONG).show()
        super.onDestroy()
    }

    override fun onStart() {
        Toast.makeText(this, "OnStart Started", Toast.LENGTH_LONG).show()
        super.onStart()
    }

    override fun onStop() {
        Toast.makeText(this, "OnStop Started", Toast.LENGTH_LONG).show()
        super.onStop()
    }
}
