package com.bilgeadam.rehberprj.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuForm extends JFrame{
    private JButton ekleButton;
    private JPanel jPanel1;
    private JButton silButton;

    public MenuForm()
    {
        add(jPanel1);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Menü Ekranı");
        setSize(300, 200);
        setLocationRelativeTo(null);

        ekleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EkleForm ekle = new EkleForm();
                ekle.setVisible(true);
            }
        });

        silButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SilForm ekle = new SilForm();
                sf.setVisible(true);
            }
        });
    }

//    public static void main(String[] args) {
//        MenuForm menu = new MenuForm();
//        menu.setVisible(true);
//    }


}
