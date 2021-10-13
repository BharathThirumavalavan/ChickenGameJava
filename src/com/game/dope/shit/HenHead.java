package com.game.dope.shit;

import javax.swing.*;
import java.awt.*;

import static com.game.dope.shit.Graphics_UI.backGround;

public class HenHead extends JLabel {
    ImageIcon face = new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\MyFirstGame\\src\\Hen120.png");
    static final int HEAD_DIM =150;
    static final int CELL_HCENTRE= ((Graphics_UI.SCR_WIDTH/Gamepanel.HEAD_COUNT)/2);

    HenHead(){
        this.setOpaque(true);
        this.setBounds(CELL_HCENTRE-(face.getIconWidth()/2),0, HEAD_DIM, HEAD_DIM);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        super.paint(g2D);
        g2D.drawImage(face.getImage(),CELL_HCENTRE-(face.getIconWidth()/2),0,null);
    }
}
