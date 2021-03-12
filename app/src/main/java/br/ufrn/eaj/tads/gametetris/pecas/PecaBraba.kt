package br.ufrn.eaj.tads.gametetris.pecas;

//Formato
/**
 *      .:.
 * **/


public class PecaBraba(linha:Int, coluna:Int): PecaBase(
    Ponto(linha,coluna),
    Ponto(linha+1,coluna-1),
    Ponto(linha+1,coluna),
    Ponto(linha+1,coluna+1)

) {
}
