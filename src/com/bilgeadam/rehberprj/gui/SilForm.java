package com.bilgeadam.rehberprj.gui;

import com.bilgeadam.rehberprj.dao.KisiDAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SilForm extends JFrame{
    private JTextField silTF;
    private JButton silButton;
    private JPanel jPanel1;

    public SilForm(){

        add(jPanel1);

        setTitle("Kişi Silme Ekranı");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(100, 150);
        setLocationRelativeTo(null);

        silButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int secim = JOptionPane.showConfirmDialog(null,
                        "Silmek istediğinize emin misiniz?",
                        "Silme Onayı",
                        JOptionPane.YES_NO_OPTION);

                if (secim == JOptionPane.YES_OPTION)
                {
                    boolean sonuc = KisiDAO.sil(Integer.parseInt(silTF.getText()));

                    if (sonuc)
                    {
                     JOptionPane.showMessageDialog(null,"Baraşıyla Silindi.");
                     setVisible(false);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Silinemedi!!");

                    }
                }
                else

            }
        });
    }

//    public static void main(String[] args) {
//        SilForm sf = new SilForm();
//        sf.setVisible(true);
//    }

}
