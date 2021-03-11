package br.ufrn.eaj.tads.gametetris;

public class Ponto(var x:Int, var y:Int) {
    fun moveUp(): Ponto{
        x--
        return this
    }

    fun moveDown(): Ponto{
        x++
        return this
    }

    fun moveRight(): Ponto{
        y++
        return this
    }
    fun moveLeft(): Ponto{
        y--
        return this
    }
}
