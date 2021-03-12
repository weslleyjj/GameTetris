package br.ufrn.eaj.tads.gametetris.pecas;

//Formato
/**
 *      ..:
 * **/

public class PecaNaja(linha:Int, coluna:Int): PecaBase(
    Ponto(linha, coluna),
    Ponto(linha+1, coluna-2),
    Ponto(linha+1, coluna-1),
    Ponto(linha+1, coluna)
) {
}
