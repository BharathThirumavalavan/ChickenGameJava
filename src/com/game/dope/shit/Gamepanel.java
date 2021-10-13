package com.game.dope.shit;

import javax.swing.*;
import java.awt.*;

public class Gamepanel extends JPanel {

    static int HEAD_COUNT=5;
    static final int HEAD_HEIGHT=120;
    Eggs eggs;
    HenHead head1;
    JPanel headStorage;

    Gamepanel(){
        this.setOpaque(true);
        //Panel for the heads
        headStorage = new JPanel();
        headStorage.setBounds(0,0,Graphics_UI.SCR_WIDTH,HEAD_HEIGHT);
        headStorage.setLayout(new GridLayout(1,HEAD_COUNT,0,0));
       // headStorage.setOpaque(true);

        //Adding Heads
        for(int i=0;i<HEAD_COUNT;i++){
            head1 = new HenHead();
            headStorage.add(head1);
        }

        //Adding Eggs
        eggs = new Eggs();
        this.add(eggs);
        this.add(headStorage);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }


}

