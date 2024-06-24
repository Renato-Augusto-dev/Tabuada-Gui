package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class CriarTabuada {
    private int numero1 = 0;
    private int multiplicando = 0;
    private int resultado = 0;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
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
        while(this.numero1 <= this.multiplicando){
            int resultado = this.numero1 * this.multiplicando;

            linhasTabuada.add(multiplicando + "x" + numero1 + "=" + resultado);
            numero1++;
        }
        return linhasTabuada;
    }

}
