package br.ufrn.eaj.tads.gametetris.pecas;

//Formato
/**
 *      :
 *      :
 * **/

public class PecaReta(linha:Int, coluna:Int): PecaBase(
    Ponto(linha, coluna),
    Ponto(linha+1, coluna),
    Ponto(linha+2, coluna),
    Ponto(linha+3, coluna)
) {

}
