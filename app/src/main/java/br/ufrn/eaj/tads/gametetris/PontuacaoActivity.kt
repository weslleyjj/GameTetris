package br.ufrn.eaj.tads.gametetris

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import br.ufrn.eaj.tads.gametetris.databinding.ActivityJogoBinding
import br.ufrn.eaj.tads.gametetris.databinding.ActivityPontuacaoBinding

class PontuacaoActivity: AppCompatActivity() {

    lateinit var binding: ActivityPontuacaoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_pontuacao)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_pontuacao)

        binding.sairDoJogo.setOnClickListener {
            finish()
        }

    }

}
