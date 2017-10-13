package Opdrachten;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht1 {


    int valerieg;
    int jeroeng;
    int hansg;

    public void init() {
        valerieg = 40;
        jeroeng = 100;
        hansg = 80;
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(100, 20, (3 * valerieg), 50);
        g.setColor(Color.green);
        g.fillRect(100, 70, (3 * jeroeng), 50);
        g.setColor(Color.blue);
        g.fillRect(100, 120, (3 * hansg), 50);
        g.setColor(Color.black);
        g.drawString("Valerie", 55, 45);
        g.drawString("Jeroen", 55, 95);
        g.drawString("Hans", 55, 145);
    }
}