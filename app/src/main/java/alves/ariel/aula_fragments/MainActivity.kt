package alves.ariel.aula_fragments

import alves.ariel.aula_fragments.fragments.FragmentsExemplo
import alves.ariel.aula_fragments.fragments.FragmentsExemplo2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            callFragmentExemple()
        }
        setupUi()

    }

    private fun setupUi() {

        val buton1 = findViewById<Button>(R.id.btn_uniforme_1).setOnClickListener {
            callFragmentExemple()
        }

        val buton2 = findViewById<Button>(R.id.btn_uniforme_2).setOnClickListener {
            callFragmentExemple2()
        }
    }



    private fun callFragmentExemple() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<FragmentsExemplo>(R.id.fragmentContainerView)
        }
    }
    private fun callFragmentExemple2() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<FragmentsExemplo2>(R.id.fragmentContainerView)
        }
    }
}