package alves.ariel.aula_fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log

@Suppress("DEPRECATION")
class App : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)

        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },1500)

    }
}