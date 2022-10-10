package br.unifei.imc.processador;

import br.unifei.imc.processador.exception.SemProcessadoresException;
import br.unifei.imc.processador.observadores.ObservadorPalavra;
import br.unifei.imc.processador.observavel.Observavel;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


public class ProcessadorFrase implements Observavel {
    @Getter
    private List<ObservadorPalavra> observadores;

    public ProcessadorFrase(){
        observadores = new ArrayList<>();
    }

    @Override
    public void registrar(ObservadorPalavra obs) {
        observadores.add(obs);
    }

    @Override
    public void cancelar(ObservadorPalavra obs) {
        observadores.remove(obs);
    }

    public void processar(String frase1) {
        if(observadores.isEmpty())
            throw new SemProcessadoresException();
        String palavras[] = frase1.split(" ");
        for (String palavra : palavras){
           observadores.forEach(obs-> obs.atualiza(palavra));
        }
    }
}
