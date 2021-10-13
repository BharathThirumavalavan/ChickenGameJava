package com.game.dope.shit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Catcher extends JPanel {
    Image Thala_head = new ImageIcon("C:\\Users\\Administrator\\Desktop\\Resources\\catcher.png").getImage() ;
    static Point start;
    static Point clicked = new Point(0,0);


    public Catcher() {
        this.setOpaque(true);
        start = new Point(0,0);
        this.addMouseMotionListener(new ListenerMouse());
        this.addMouseListener(new ListenerMouse());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.GREEN);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(Thala_head,start.x,0,null);
    }


    public class ListenerMouse extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            clicked.setLocation(e.getX()-start.getX(),0);
        }
        @Override
        public void mouseDragged(MouseEvent e) {
           start = new Point((int)(e.getX()-clicked.getX()),0);
           repaint();
        }
    }

}
