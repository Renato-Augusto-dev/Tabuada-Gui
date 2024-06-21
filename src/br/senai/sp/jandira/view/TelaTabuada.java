package br.senai.sp.jandira.view;

import javax.swing.*;
import java.awt.*;

public class TelaTabuada {
    private JFrame frame = new JFrame();
    private JPanel painelTitulo = new JPanel();
    private JLabel labelTitulo = new JLabel("Tabuada Do Reinatinho");
    private JLabel labelNumero = new JLabel("Numero");


    public TelaTabuada(){
        criarTela();
    }

    private void criarTela(){


        frame.setTitle("Tabuada");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        painelTitulo.setBounds(0,0,700,100);
        painelTitulo.setLayout(null);
        painelTitulo.setBackground(new Color(208,126,212));
        labelTitulo.setBounds(300,10,200,10);
        labelNumero.setBounds(10,200,100,100);

        frame.getContentPane().add(labelNumero);
        frame.getContentPane().add(labelTitulo);
        frame.getContentPane().add(painelTitulo);

        frame.setVisible(true);
    }
}
