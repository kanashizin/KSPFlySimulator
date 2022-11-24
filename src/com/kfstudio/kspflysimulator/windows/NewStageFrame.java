package com.kfstudio.kspflysimulator.windows;

import javax.swing.JFrame;

public class NewStageFrame extends JFrame{

    public NewStageFrame(String name){
        super(name);

        setSize(300, 300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setAutoRequestFocus(true);
        setVisible(true);

    }
    
}