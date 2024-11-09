/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadastro.os;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author si
 */
public class Home extends Frame implements ActionListener {
    protected Dimension dQuadro, dRotulo, dCaixaTexto, dBotao;
    protected Button bValidar, bSair;
    protected TextField txtNumOs, txtCliente, txtContato, txtMarca, txtModelo, txtAno, txtLaudo;
    protected Label lblNumOS, lblCliente, lblContato, lblMarca, lblModelo, lblAno, lblLaudo, lblLista;
    protected List listOs;
    
    public Home(){
        Dimension dQuadro = new Dimension(900, 600);
        Dimension dRotulo = new Dimension(45,25);
        Dimension dRotuloLista = new Dimension(150,25);
        Dimension dCaixaTexto = new Dimension(180, 25);
        Dimension dBotao = new Dimension(110,25);
        Dimension dList = new Dimension(550,330);

        setTitle("Cadastro de O.S");
        setResizable(false);
        setSize(dQuadro);
        setLocation(650,350);
        setLayout(null);

        lblNumOS = new Label("N° O.S*");
        lblNumOS.setSize(dRotulo);
        lblNumOS.setLocation(25, 50);

        txtNumOs = new TextField();
        txtNumOs.setSize(dCaixaTexto);
        txtNumOs.setLocation(80, 50);
        
        lblCliente = new Label("Cliente*");
        lblCliente.setSize(dRotulo);
        lblCliente.setLocation(25, 100);

        txtCliente = new TextField();
        txtCliente.setSize(dCaixaTexto);
        txtCliente.setLocation(80, 100);
        
        lblContato = new Label("Contato*");
        lblContato.setSize(dRotulo);
        lblContato.setLocation(25, 150);

        txtContato = new TextField();
        txtContato.setSize(dCaixaTexto);
        txtContato.setLocation(80, 150);

        lblMarca = new Label("Marca*");
        lblMarca.setSize(dRotulo);
        lblMarca.setLocation(25, 200);

        txtMarca = new TextField();
        txtMarca.setSize(dCaixaTexto);
        txtMarca.setLocation(80, 200);

        lblModelo = new Label("Modelo*");
        lblModelo.setSize(dRotulo);
        lblModelo.setLocation(25, 250);

        txtModelo = new TextField();
        txtModelo.setSize(dCaixaTexto);
        txtModelo.setLocation(80, 250);

        lblAno = new Label("Ano*");
        lblAno.setSize(dRotulo);
        lblAno.setLocation(25, 300);

        txtAno = new TextField();
        txtAno.setSize(dCaixaTexto);
        txtAno.setLocation(80, 300);

        lblLaudo = new Label("Laudo*");
        lblLaudo.setSize(dRotulo);
        lblLaudo.setLocation(25, 350);

        txtLaudo = new TextField();
        txtLaudo.setSize(dCaixaTexto);
        txtLaudo.setLocation(80, 350);
        
        lblLista = new Label("0 Ordens Registradas");
        lblLista.setSize(dRotuloLista);
        lblLista.setLocation(300, 50);
        
        listOs = new List();
        listOs.setSize(dList);
        listOs.setLocation(300, 100);
        

        bValidar = new Button("Cadastrar O.S");
        bValidar.setSize(dBotao);
        bValidar.setLocation(25, 400);
        bValidar.addActionListener(this);

        bSair = new Button("Sair");
        bSair.setSize(dBotao);
        bSair.setLocation(150, 400);
        bSair.addActionListener(this);

        add(lblNumOS);
        add(txtNumOs);
        add(lblCliente);
        add(txtCliente);
        add(lblContato);
        add(txtContato);
        add(lblMarca);
        add(txtMarca);
        add(lblModelo);
        add(txtModelo);
        add(lblAno);
        add(txtAno);
        add(lblLaudo);
        add(txtLaudo);
        add(bValidar);
        add(lblLista);
        add(listOs);
        add(bSair);
    }
    
    public void actionPerformed(ActionEvent evento){
        
        if(evento.getSource() == bValidar){
            String camposObrigatorios = "";

            if (txtNumOs.getText().equals("")) camposObrigatorios += "Número da O.S\n";
            if (txtCliente.getText().equals("")) camposObrigatorios += "Nome do Cliente\n";
            if (txtContato.getText().equals("")) camposObrigatorios += "Contato do Cliente\n";
            if (txtMarca.getText().equals("")) camposObrigatorios += "Marca do Veículo\n";
            if (txtModelo.getText().equals("")) camposObrigatorios += "Modelo do Veículo\n";
            if (txtAno.getText().equals("")) camposObrigatorios += "Ano do Veículo\n";
            if (txtLaudo.getText().equals("")) camposObrigatorios += "Laudo";

            if (!camposObrigatorios.equals("")) {
                JOptionPane.showMessageDialog (null, "Os campos abaixo são obrigatórios:\n" + camposObrigatorios);
            } else {
                this.listOs.add(txtNumOs.getText() + " | " + txtCliente.getText() + " | " + txtContato.getText() + " | " + txtMarca.getText() + " | " + txtModelo.getText() + " | " + txtAno.getText() + " | " + txtLaudo.getText());
                txtNumOs.setText("");
                txtCliente.setText("");
                txtContato.setText("");
                txtMarca.setText("");
                txtModelo.setText("");
                txtAno.setText("");
                txtLaudo.setText("");
                lblLista.setText(this.listOs.getItemCount() + " Ordens Registradas");
            }
        }
        if(evento.getSource() == bSair){
            System.out.println("Fim do Aplicativo. Obrigado!");
                System.exit(0);
        }
    }

}

