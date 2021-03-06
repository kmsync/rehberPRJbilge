package com.bilgeadam.rehberprj.test;

import com.bilgeadam.rehberprj.dao.KisiDAO;
import com.bilgeadam.rehberprj.dto.KisiDTO;
import com.bilgeadam.rehberprj.util.CevirmeIslemleri;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public class KisiDAOTest {

    public void ekleTest() throws ParseException, SQLException, ClassNotFoundException {
        KisiDTO kisi = new KisiDTO();
        kisi.setNo(3);
        kisi.setAd("Zalim");
        kisi.setSoyad("Reis");
        kisi.setMaas(0);
        kisi.setDogtar(CevirmeIslemleri.strToUtilDate("21/04/2002"));
        kisi.setMobilTel("+90532saray");

        boolean sonuc = KisiDAO.ekle(kisi);

        if (sonuc)
            System.out.println("Başarıyla eklendi.");
        else
            System.out.println("Eklenemedi!!!");
    }

    public void silTest() throws SQLException, ClassNotFoundException {

        boolean sonuc = KisiDAO.sil(2);

        if (sonuc)
            System.out.println("Başarıyla silindi.");
        else
            System.out.println("Silinemedi!!!");
    }

    public void guncelleTest() throws ParseException, SQLException, ClassNotFoundException {
        KisiDTO kisi = new KisiDTO();
        kisi.setNo(1);
        kisi.setAd("Aziz");
        kisi.setSoyad("Pancar");
        kisi.setMaas(1000);
        kisi.setDogtar(CevirmeIslemleri.strToUtilDate("21/04/2002"));
        kisi.setMobilTel("+90532pancar");

        boolean sonuc = KisiDAO.ekle(kisi);

        if (sonuc)
            System.out.println("Başarıyla güncellendi.");
        else
            System.out.println("Güncellenemedi!!!");
    }

    public void listeleTest()
            throws SQLException, ClassNotFoundException {

        List<KisiDTO> kisiler = KisiDAO.listele();

        for (KisiDTO kisi : kisiler) {
            System.out.println(kisi);
        }
    }

    public static void main(String[] args) {

        try {

            KisiDAOTest kdt = new KisiDAOTest();
            //kdt.ekleTest();
            //kdt.listeleTest();
            //kdt.silTest();
            kdt.guncelleTest();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}