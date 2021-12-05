package com.bilgeadam.sayisallotogui.ekran;

import com.bilgeadam.sayisallotogui.SayisalIslem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SayisalLoto extends JFrame {
    private JPanel jPanel1;
    private JLabel baslikLabel;
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JTextField tf5;
    private JTextField tf6;
    private JButton cevirButton;

    public SayisalLoto() {

        add(jPanel1);
        setTitle("Sayısal Loto v1.0");
        setSize(450, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cevirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SayisalIslem islem = new SayisalIslem();

                int[] sayilar = islem.arrayDoldur();

                tf1.setText(String.valueOf(sayilar[0]));
                tf2.setText(String.valueOf(sayilar[1]));
                tf3.setText(String.valueOf(sayilar[2]));
                tf4.setText(String.valueOf(sayilar[3]));
                tf5.setText(String.valueOf(sayilar[4]));
                tf6.setText(String.valueOf(sayilar[5]));

            }
        });
    }
}