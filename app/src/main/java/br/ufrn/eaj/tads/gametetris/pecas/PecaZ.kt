package br.ufrn.eaj.tads.gametetris.pecas;

import br.ufrn.eaj.tads.gametetris.Ponto

//Formato
/**
 *      Z
 * **/

public class PecaZ(linha:Int, coluna:Int): PecaBase(
    Ponto(linha, coluna),
    Ponto(linha, coluna+1),
    Ponto(linha+1, coluna+1),
    Ponto(linha+1, coluna+2)

) {
}
