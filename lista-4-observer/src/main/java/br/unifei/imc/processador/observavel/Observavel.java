package br.unifei.imc.processador.observavel;

import br.unifei.imc.processador.observadores.ObservadorPalavra;


public interface Observavel {
    void registrar(ObservadorPalavra obs);

    void cancelar(ObservadorPalavra obs);
}
