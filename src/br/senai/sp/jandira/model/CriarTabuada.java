package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class CriarTabuada {
    private int multiplicadorMinimo = 0;
    private int multiplicando = 0;
    private int resultado = 0;

    public int getMultiplicadorMinimo() {
        return multiplicadorMinimo;
    }

    public void setMultiplicadorMinimo(int multiplicadorMinimo) {
        this.multiplicadorMinimo = multiplicadorMinimo;
    }

    public int getMultiplicando() {
        return multiplicando;
    }

    public void setMultiplicando(int multiplicando) {
        this.multiplicando = multiplicando;
    }
    //Criando um metodo para criar a tabuada
    public List<String> gerarTabuada(){

        //Criando um array chamado linhasTabuada
        List<String> linhasTabuada = new ArrayList<>();

        //Fazendo a tabuada
        while(this.multiplicadorMinimo <= this.multiplicando){
            int resultado = this.multiplicando * this.multiplicadorMinimo;

            linhasTabuada.add(multiplicando + "x" + multiplicadorMinimo + "=" + resultado);
            multiplicadorMinimo++;
        }
        return linhasTabuada;
    }

}
