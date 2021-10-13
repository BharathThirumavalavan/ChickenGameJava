package com.game.dope.shit;

import javax.swing.*;
import java.awt.*;

public class Graphics_UI extends JFrame {
    ScoreCard header;
    Gamepanel Game_zone;
    Catcher footer = new Catcher();
    static Image backGround = new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\MyFirstGame\\src\\wall.png").getImage();

    ScoreCard Score;

    static final int SCR_WIDTH=1400;
    static final int SCR_HEIGHT=800;
    static final int SCR_SPACE=25;
    static final int FOOTER_SPACE=75;

    public Graphics_UI(){
        super("Omellete");
        this.setLayout(new BorderLayout(0,0));
        //Panels
        header = new ScoreCard();
        header.setPreferredSize(new Dimension(SCR_SPACE,SCR_SPACE));
        header.setLayout(null);

        footer.setBackground(Color.WHITE);
        footer.setPreferredSize(new Dimension(FOOTER_SPACE,FOOTER_SPACE));

        Game_zone = new Gamepanel();
        Game_zone.setLayout(null);
        Game_zone.setBackground(Color.BLACK);

        //adding members
        this.add(header,BorderLayout.NORTH);
        this.add(footer,BorderLayout.SOUTH);
        this.add(Game_zone,BorderLayout.CENTER);

        //Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(SCR_WIDTH,SCR_HEIGHT);
        this.setResizable(false);
        this.setVisible(true);
    }

    public class ScoreCard extends JPanel{
        ScoreCard(){
            this.setOpaque(true);
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.setColor(Color.BLACK);
            UpdateScore(g);
        }

        public void UpdateScore(Graphics g){
            g.setFont(new Font("San Serif", Font.BOLD,15));
            g.drawString("Score: " + Eggs.scoreTracker,1200,20);
            repaint();
        }
    }

}

