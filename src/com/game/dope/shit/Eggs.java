package com.game.dope.shit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static com.game.dope.shit.Graphics_UI.backGround;

public class Eggs extends JPanel implements ActionListener {
    static int scoreTracker = 0;

    static ImageIcon egg = new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\MyFirstGame\\src\\poop.png");
   // static ImageIcon
    static int yCord = 1;
    static int Velocity = 5;
    Timer drop;
    Random random;
    int egg_X = HenHead.CELL_HCENTRE - (egg.getIconWidth() / 2);
    String dialog[] = {"Restart","I Quit"};

    Eggs() {
        this.setOpaque(true);
        this.setBounds(0, Gamepanel.HEAD_HEIGHT, Graphics_UI.SCR_WIDTH, Graphics_UI.SCR_HEIGHT);
        drop = new Timer(1, this);
        drop.start();
        random = new Random();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(egg.getImage(), egg_X, yCord, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (yCord <= 500) {
            yCord += Velocity;
            repaint();

        } else if ((Catcher.start.getX() < (egg_X) + (int) (egg.getIconWidth() / 2)) &&
                (Catcher.start.getX() + 100) > (egg_X) + (int) (egg.getIconWidth() / 2)) {
            System.out.println(++scoreTracker);
            if (scoreTracker % 5 == 0) {
                Velocity++;
            }
            yCord = 0;
            egg_X = (HenHead.CELL_HCENTRE - (egg.getIconWidth() / 2)) + (random.nextInt(Gamepanel.HEAD_COUNT) * (Graphics_UI.SCR_WIDTH / Gamepanel.HEAD_COUNT));
        } else {
            int i=JOptionPane.showOptionDialog(null, "Your Score is " + Eggs.scoreTracker, "Game Over", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE,null,dialog,0 );
            switch (i){
                case 0:
                    new Graphics_UI();
                    System.exit(1);
                    break;
                default:System.exit(0);
                    break;
            }
        }

    }
}

