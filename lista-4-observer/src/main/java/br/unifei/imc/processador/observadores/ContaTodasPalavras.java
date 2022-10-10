package br.unifei.imc.processador.observadores;


public class ContaTodasPalavras  implements ObservadorPalavra {

    private int numPalavras;

    @Override
    public int getNumPalavras() {
        return numPalavras;
    }

    @Override
    public void atualiza(String palavra) {
        numPalavras++;
    }
}
