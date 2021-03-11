package br.ufrn.eaj.tads.gametetris.pecas;

import br.ufrn.eaj.tads.gametetris.Ponto

//Formato
/**
 *      :
 *     :
 * **/

public class PecaEscada(linha:Int, coluna:Int): PecaBase(
    Ponto(linha, coluna),
    Ponto(linha+1, coluna),
    Ponto(linha+2, coluna-1),
    Ponto(linha+3, coluna-1)
) {
}
