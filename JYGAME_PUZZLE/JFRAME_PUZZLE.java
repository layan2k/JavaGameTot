package JYGAME_PUZZLE;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JFRAME_PUZZLE extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, next;

    JFRAME_PUZZLE() {
        super("JFrame Puzzle");
        b1 = new JButton("1");
        b2 = new JButton("");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("2");
        next = new JButton("next");

        b1.setBounds(10, 20, 50, 40);
        b2.setBounds(70, 30, 50, 40);
        b3.setBounds(130, 30, 50, 40);
        b4.setBounds(10, 80, 50, 40);
        b5.setBounds(70, 80, 50, 40);
        b6.setBounds(130, 80, 50, 40);
        b7.setBounds(10, 130, 50, 40);
        b8.setBounds(70, 130, 50, 40);
        b9.setBounds(130, 130, 50, 40);
        next.setBounds(70, 200, 100, 40);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(next);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        next.addActionListener(this);

        next.setBackground(Color.black);
        next.setForeground(Color.green);
        setSize(250, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            String s = b4.getText();
            b4.setText(b9.getText());
            b9.setText(s);

            s = b1.getText();
            b1.setText(b5.getText());
            b5.setText(s);

            s = b2.getText();
            b2.setText(b7.getText());
            b7.setText(s);
        }
        // First Deck
        if (e.getSource() == b1) {
            String lable = b1.getText();
            if (b2.getText().equals("")) {
                b2.setText(lable);
                b1.setText("");
            }
            if (b4.getText().equals("")) {
                b4.setText(lable);
                b1.setText("");
            }
        }
        if (e.getSource() == b2) {
            String lable = b2.getText();
            if (b1.getText().equals("")) {
                b1.setText(lable);
                b2.setText("");
            }
            if (b3.getText().equals("")) {
                b3.setText(lable);
                b2.setText("");
            }
            if (b5.getText().equals("")) {
                b5.setText(lable);
                b2.setText("");
            }
        }
        if (e.getSource() == b3) {
            String lable = b3.getText();
            if (b2.getText().equals("")) {
                b2.setText(lable);
                b3.setText("");
            }
            if (b6.getText().equals("")) {
                b6.setText(lable);
                b3.setText("");
            }
        }
        // Second Deck
        if (e.getSource() == b4) {
            String lable = b4.getText();
            if (b5.getText().equals("")) {
                b5.setText(lable);
                b4.setText("");
            }
            if (b7.getText().equals("")) {
                b7.setText(lable);
                b4.setText("");
            }
            if (b1.getText().equals("")) {
                b1.setText(lable);
                b4.setText("");
            }
        }
        if (e.getSource() == b5) {
            String lable = b5.getText();
            if (b2.getText().equals("")) {
                b2.setText(lable);
                b5.setText("");
            }
            if (b4.getText().equals("")) {
                b4.setText(lable);
                b5.setText("");
            }
            if (b8.getText().equals("")) {
                b8.setText(lable);
                b5.setText("");
            }
            if (b6.getText().equals("")) {
                b6.setText(lable);
                b5.setText("");
            }
        }
        if (e.getSource() == b6) {
            String lable = b6.getText();
            if (b3.getText().equals("")) {
                b3.setText(lable);
                b6.setText("");
            }
            if (b5.getText().equals("")) {
                b5.setText(lable);
                b6.setText("");
            }
            if (b9.getText().equals("")) {
                b9.setText(lable);
                b6.setText("");
            }
        }

        // Third Deck
        if (e.getSource() == b7) {
            String lable = b7.getText();
            if (b4.getText().equals("")) {
                b4.setText(lable);
                b7.setText("");
            }
            if (b8.getText().equals("")) {
                b8.setText(lable);
                b7.setText("");
            }
        }
        if (e.getSource() == b8) {
            String lable = b8.getText();
            if (b7.getText().equals("")) {
                b7.setText(lable);
                b8.setText("");
            }
            if (b9.getText().equals("")) {
                b9.setText(lable);
                b8.setText("");
            }
            if (b5.getText().equals("")) {
                b5.setText(lable);
                b8.setText("");
            }
        }
        if (e.getSource() == b9) {
            String lable = b9.getText();
            if (b8.getText().equals("")) {
                b8.setText(lable);
                b9.setText("");
            }
            if (b6.getText().equals("")) {
                b6.setText(lable);
                b9.setText("");
            }
        }

        if (b1.getText().equals("1")
                && b2.getText().equals("2")
                && b3.getText().equals("3")
                && b4.getText().equals("4")
                && b5.getText().equals("5")
                && b6.getText().equals("6")
                && b7.getText().equals("7")
                && b8.getText().equals("8")) {
            JOptionPane.showMessageDialog(this, "Congradulations you won the game");
        }

    }

    public static void main(String[] args) {

        new JFRAME_PUZZLE();

    }

}
