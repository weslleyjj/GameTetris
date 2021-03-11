package br.ufrn.eaj.tads.gametetris.pecas;

import br.ufrn.eaj.tads.gametetris.Ponto

//Formato
/**
 *      ..
 *      :
 * **/

public class PecaPole(linha:Int, coluna:Int): PecaBase(
    Ponto(linha, coluna),
    Ponto(linha, coluna+1),
    Ponto(linha+1, coluna),
    Ponto(linha+2, coluna)
) {
}
