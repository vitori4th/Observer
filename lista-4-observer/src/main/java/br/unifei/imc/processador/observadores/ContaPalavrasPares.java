package br.unifei.imc.processador.observadores;

public class ContaPalavrasPares implements ObservadorPalavra{
    private int numPalavras;
    @Override
    public int getNumPalavras() {
        return numPalavras;
    }

    @Override
    public void atualiza(String palavra) {
       if(palavra.length()%2==0)
           numPalavras++;
    }
}
