package Opdrachten;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Wereldtijden extends Applet {
    TextField tekstvak;
    Button knop;
    int invoer = 0;

    public void init() {
        this.setSize(650,430);
        tekstvak = new TextField("", 15);
        knop = new Button("Toon tijden");
        knop.addActionListener( new KnopListener() );



        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        int teller = 1;
        int y = 60;
        int LN = 1;
        int ZA = 0;
        int TY = 7;
        int NY = 6;


        if (invoer >0){
            while(teller <= 1) {

                g.drawString("In London is het"+ "." +(invoer-LN)+":00"+"uur",70,40);
                g.drawString("In New York is het"+"." +(invoer-NY)+":00"+"uur",70,70);
                g.drawString("In Zuid Afrika is het"+"." +(invoer-ZA)+":00"+"uur",70,100);
                g.drawString("In Tokyo is het"+ "." +(invoer+TY)+":00"+"uur",70,130);

                y += 20;
                teller++;
            }
        }
        tekstvak.setText("");
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            invoer = Integer.parseInt(tekstvak.getText());
            repaint();
        }
    }

}







