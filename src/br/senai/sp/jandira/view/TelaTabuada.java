package br.senai.sp.jandira.view;

import br.senai.sp.jandira.model.CriarTabuada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TelaTabuada {

    //Criando os objetos
    private JFrame frame = new JFrame();
    private JPanel painelTitulo = new JPanel();
    private JPanel linhaPreta = new JPanel();
    private JLabel labelTitulo = new JLabel("Tabuada Do Reinatinho");
    private JLabel labelNumero = new JLabel("Multiplicando Minino");
    private JTextField txtNumero = new JTextField();
    private JLabel labelMultiplicado = new JLabel("Multiplicando");
    private JTextField txtMultiplicado = new JTextField();
    private JLabel labelResultado = new JLabel("");
    private JButton btnCalcular = new JButton("Calcular");
    private JButton btnLimpar = new JButton("Limpar");
    private JTextArea txtAreaTabuada1 = new JTextArea();

    CriarTabuada criarTabuada = new CriarTabuada();

    //Criando um construtor
    public TelaTabuada(){
        criarTela();
    }

    private void criarTela(){

        //Configurando a tela
        frame.setTitle("Tabuada");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        //Criando a cor de fundo
        painelTitulo.setBounds(0,0,700,100);
        painelTitulo.setLayout(null);
        painelTitulo.setBackground(new Color(208,126,212));


        linhaPreta.setBounds(300,100,1,360);
        linhaPreta.setBackground(Color.BLACK);

        labelTitulo.setBounds(230,10,300,20);
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 24));


        labelNumero.setBounds(10,100,300,100);
        labelNumero.setFont(new Font("Arial", Font.BOLD, 24));
        txtNumero.setBounds(10,170,250,25);
        txtNumero.setFont(new Font("Arial",Font.BOLD,14));

        labelMultiplicado.setBounds(10,200,200,100);
        labelMultiplicado.setFont(new Font("Arial",Font.BOLD,24));
        txtMultiplicado.setBounds(10,270,200,25);
        txtMultiplicado.setFont(new Font("Arial",Font.BOLD,14));

        labelResultado.setBounds(400,100,200,100);

        //Configurando a area do resultado
        txtAreaTabuada1.setBounds(350,100,400,360);
        txtAreaTabuada1.setFont(new Font("Arial",Font.BOLD, 14));
        txtAreaTabuada1.setEditable(false);
        txtAreaTabuada1.setLineWrap(true);


        btnCalcular.setBounds(10,300,90,30);
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        btnLimpar.setBounds(100,300,90,30);
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparTela();
            }
        });

        //Adicionando os componentes
        frame.getContentPane().add(txtAreaTabuada1);
        frame.getContentPane().add(btnLimpar);
        frame.getContentPane().add(btnCalcular);
        frame.getContentPane().add(labelResultado);
        frame.getContentPane().add(txtMultiplicado);
        frame.getContentPane().add(labelMultiplicado);
        frame.getContentPane().add(txtNumero);
        frame.getContentPane().add(labelNumero);
        frame.getContentPane().add(labelTitulo);
        frame.getContentPane().add(linhaPreta);
        frame.getContentPane().add(painelTitulo);

        frame.setVisible(true);
    }
    private void limparTela(){
        txtNumero.setText("");
        txtMultiplicado.setText("");
        labelResultado.setText("");

        txtNumero.requestFocus();
    }
    private void calcular(){
        int mutliplicando = Integer.parseInt(txtMultiplicado.getText());
        int mutliplicadorMinimo = Integer.parseInt(txtNumero.getText());

        int contador = 0;
        criarTabuada.setMultiplicando(mutliplicando);
        criarTabuada.setMultiplicadorMinimo(mutliplicadorMinimo);

        //Criando um list para guarda os resultados
        List<String> listaTabuada = criarTabuada.gerarTabuada();

        //Vai mostrar o resultado pro usuario
        for (String linha : listaTabuada) {
            if (contador < 20) {
                txtAreaTabuada1.append(linha + "\n");
                contador++;
            }
        }
    }
}
