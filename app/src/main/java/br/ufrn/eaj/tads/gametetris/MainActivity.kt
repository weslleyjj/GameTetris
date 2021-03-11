package br.ufrn.eaj.tads.gametetris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.databinding.DataBindingUtil
import br.ufrn.eaj.tads.gametetris.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.configuracoes.setOnClickListener {
            val intent = Intent(this, ConfigActivity::class.java)
            startActivity(intent)
        }

    }
}
