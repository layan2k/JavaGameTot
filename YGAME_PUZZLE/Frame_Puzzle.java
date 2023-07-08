package YGAME_PUZZLE;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame_Puzzle extends Frame implements ActionListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    Frame_Puzzle() {
        super("Puzzle Frame");
        b1 = new Button("1");
        b1.setBounds(50, 100, 40, 40);
        b2 = new Button("2");
        b2.setBounds(100, 100, 40, 40);
        b3 = new Button("3");
        b3.setBounds(150, 100, 40, 40);
        b4 = new Button("4");
        b4.setBounds(50, 150, 40, 40);
        b5 = new Button("5");
        b5.setBounds(100, 150, 40, 40);
        b6 = new Button("6");
        b6.setBounds(150, 150, 40, 40);
        b7 = new Button("7");
        b7.setBounds(50, 200, 40, 40);
        b8 = new Button("");
        b8.setBounds(100, 200, 40, 40);
        b9 = new Button("8");
        b9.setBounds(150, 200, 40, 40);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // First Deck
        if (e.getSource() == b1) {
            String lable = b1.getLabel();
            if (b2.getLabel().equals("")) {
                b2.setLabel(lable);
                b1.setLabel("");
            }
            if (b4.getLabel().equals("")) {
                b4.setLabel(lable);
                b1.setLabel("");
            }
        }
        if (e.getSource() == b2) {
            String lable = b2.getLabel();
            if (b1.getLabel().equals("")) {
                b1.setLabel(lable);
                b2.setLabel("");
            }
            if (b3.getLabel().equals("")) {
                b3.setLabel(lable);
                b2.setLabel("");
            }
            if (b5.getLabel().equals("")) {
                b5.setLabel(lable);
                b2.setLabel("");
            }
        }
        if (e.getSource() == b3) {
            String lable = b3.getLabel();
            if (b2.getLabel().equals("")) {
                b2.setLabel(lable);
                b3.setLabel("");
            }
            if (b6.getLabel().equals("")) {
                b6.setLabel(lable);
                b3.setLabel("");
            }
        }
        // Second Deck
        if (e.getSource() == b4) {
            String lable = b4.getLabel();
            if (b5.getLabel().equals("")) {
                b5.setLabel(lable);
                b4.setLabel("");
            }
            if (b7.getLabel().equals("")) {
                b7.setLabel(lable);
                b4.setLabel("");
            }
            if (b1.getLabel().equals("")) {
                b1.setLabel(lable);
                b4.setLabel("");
            }
        }
        if (e.getSource() == b5) {
            String lable = b5.getLabel();
            if (b2.getLabel().equals("")) {
                b2.setLabel(lable);
                b5.setLabel("");
            }
            if (b4.getLabel().equals("")) {
                b4.setLabel(lable);
                b5.setLabel("");
            }
            if (b8.getLabel().equals("")) {
                b8.setLabel(lable);
                b5.setLabel("");
            }
            if (b6.getLabel().equals("")) {
                b6.setLabel(lable);
                b5.setLabel("");
            }
        }
        if (e.getSource() == b6) {
            String lable = b6.getLabel();
            if (b3.getLabel().equals("")) {
                b3.setLabel(lable);
                b6.setLabel("");
            }
            if (b5.getLabel().equals("")) {
                b5.setLabel(lable);
                b6.setLabel("");
            }
            if (b9.getLabel().equals("")) {
                b9.setLabel(lable);
                b6.setLabel("");
            }
        }

        // Third Deck
        if (e.getSource() == b7) {
            String lable = b7.getLabel();
            if (b4.getLabel().equals("")) {
                b4.setLabel(lable);
                b7.setLabel("");
            }
            if (b8.getLabel().equals("")) {
                b8.setLabel(lable);
                b7.setLabel("");
            }
        }
        if (e.getSource() == b8) {
            String lable = b8.getLabel();
            if (b7.getLabel().equals("")) {
                b7.setLabel(lable);
                b8.setLabel("");
            }
            if (b9.getLabel().equals("")) {
                b9.setLabel(lable);
                b8.setLabel("");
            }
            if (b5.getLabel().equals("")) {
                b5.setLabel(lable);
                b8.setLabel("");
            }
        }
        if (e.getSource() == b9) {
            String lable = b9.getLabel();
            if (b8.getLabel().equals("")) {
                b8.setLabel(lable);
                b9.setLabel("");
            }
            if (b6.getLabel().equals("")) {
                b6.setLabel(lable);
                b9.setLabel("");
            }
        }
        if (b1.getLabel().equals("1")
                && b2.getLabel().equals("2")
                && b3.getLabel().equals("3")
                && b4.getLabel().equals("4")
                && b5.getLabel().equals("5")
                && b6.getLabel().equals("6")
                && b7.getLabel().equals("7")
                && b8.getLabel().equals("8")) {
            JOptionPane.showMessageDialog(this, "Congradulations you won the game");
        }
        ;
    }

    public static void main(String[] args) {
        new Frame_Puzzle();
    }

}
