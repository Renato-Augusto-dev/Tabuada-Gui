package br.senai.sp.jandira.model;

public class CriarTabuada {
    private int numero1 = 0;
    private int multiplicando = 0;


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

    public void gerarTabuada(int multiplicando, int numero1){
        while(numero1 <= multiplicando){
            int resultado = numero1 * multiplicando;
            System.out.printf("%s X %s = %s \n", numero1, multiplicando,resultado);

            numero1++;
        }

    }

}
