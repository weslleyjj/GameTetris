package br.ufrn.eaj.tads.gametetris.pecas

import br.ufrn.eaj.tads.gametetris.Ponto

open class PecaBase(pontoA: Ponto, pontoB: Ponto, pontoC: Ponto, pontoD: Ponto) {
    private var peca = arrayOf(
        Ponto(pontoA.x, pontoA.y),
        Ponto(pontoB.x, pontoB.y),
        Ponto(pontoC.x, pontoC.y),
        Ponto(pontoD.x, pontoD.y)
    )

    open fun moveDown(){
        peca.forEach {
            it.moveDown()
        }
    }

    open fun moveRight() {
        peca.forEach {
            it.moveRight()
        }
    }

    open fun moveLeft(){
        peca.forEach {
            it.moveLeft()
        }
    }

    open fun rotate(): Array<Ponto>{
        return arrayOf()
    }

    open fun getPeca(): Array<Ponto>{
        return peca
    }

    open fun setPeca(peca: Array<Ponto>){
        this.peca = peca
    }




}