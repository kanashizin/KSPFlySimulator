/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kfstudio.kspflysimulator.windows;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author KanashiiStudio
 */
public class MainFrame extends JFrame{
    
    private JButton jbNewStage;

    public MainFrame(){
        super("KSP Calculator");
        
        setLayout(new FlowLayout());

        jbNewStage = new JButton("Criar Novo Estagio");
        //Personalizando o Botão de Stage
        defNewStageBTN();
        //Adicionando Botão
        

        setSize(600, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setAutoRequestFocus(true);

        add(jbNewStage);


        setVisible(true);


    }

    private void defNewStageBTN(){

        jbNewStage.setBounds(100, 100, 100, 100);

    }
    
}
