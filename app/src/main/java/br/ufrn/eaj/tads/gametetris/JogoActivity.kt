package br.ufrn.eaj.tads.gametetris

import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import br.ufrn.eaj.tads.gametetris.databinding.ActivityConfigBinding
import br.ufrn.eaj.tads.gametetris.databinding.ActivityJogoBinding

class JogoActivity:AppCompatActivity() {


    lateinit var binding:ActivityJogoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_jogo)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_jogo)

        binding.pausa.setOnClickListener {
            finish()
        }

    }

    /*
    val LINHA = 36
    val COLUNA = 26
    var running = true
    var speed:Long = 300

    var pt = Ponto(0,15)

    inner class Ponto(var x:Int,var y:Int){
        fun moveDown(){
            x++
        }
    }


    //val board = Array(LINHA, { IntArray(COLUNA) })

    var board = Array(LINHA) {
        Array(COLUNA){0}
    }

    var boardView = Array(LINHA){
        arrayOfNulls<ImageView>(COLUNA)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridboard.rowCount = LINHA
        gridboard.columnCount = COLUNA

        val inflater = LayoutInflater.from(this)

        for (i in 0 until LINHA) {
            for (j in 0 until COLUNA) {
                boardView[i][j] = inflater.inflate(R.layout.inflate_image_view, gridboard, false) as ImageView
                gridboard.addView( boardView[i][j])
            }
        }

        gameRun()
    }

    fun gameRun(){
        Thread{
            while(running){
                Thread.sleep(speed)
                runOnUiThread{
                    //limpa tela
                    for (i in 0 until LINHA) {
                        for (j in 0 until COLUNA) {
                            if(board[i][j] == 1){
                                continue
                            }
                            boardView[i][j]!!.setImageResource(R.drawable.black)
                        }
                    }
                    //move peça atual
                    pt.moveDown()
                    //print peça
                    try {
                        if(board[pt.x][pt.y] == 1){
                            boardView[pt.x-1][pt.y]!!.setImageResource(R.drawable.white)
                            board[pt.x-1][pt.y] = 1 // o board é utilizado para mapear onde tem peças
                            pt.x = 0
                        }else{
                            boardView[pt.x][pt.y]!!.setImageResource(R.drawable.white)
                        }

                    }catch (e:ArrayIndexOutOfBoundsException ) {
                        //se a peça passou das bordas eu vou parar o jogo
                        //running = false
                        board[pt.x-1][pt.y] = 1
                        pt.x = 0
                    }

                }
            }
        }.start()
    }*/
}