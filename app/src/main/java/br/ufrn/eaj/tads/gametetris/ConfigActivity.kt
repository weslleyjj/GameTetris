package br.ufrn.eaj.tads.gametetris

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import br.ufrn.eaj.tads.gametetris.databinding.ActivityConfigBinding

class ConfigActivity: AppCompatActivity() {
    lateinit var binding: ActivityConfigBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_config)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_config)

        binding.confirmaDificuldade.setOnClickListener {

        }

        binding.cancelaConfiguracoes.setOnClickListener {
            finish()
        }

    }
}