package com.hb01.evdeCalisma01;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DataRecord {

	public static void main(String[] args) {

		Bolum bolum1 = new Bolum();
		bolum1.setBolumId(1);
		bolum1.setBolumAdi("Yonetim");

		Bolum bolum2 = new Bolum();
		bolum2.setBolumId(2);
		bolum2.setBolumAdi("Bilisim IT");

		Bolum bolum3 = new Bolum();
		bolum3.setBolumId(3);
		bolum3.setBolumAdi("Teknik Servis");

		Bolum bolum4 = new Bolum();
		bolum4.setBolumId(5);
		bolum4.setBolumAdi("Muhasebe");

		Bolum bolum5 = new Bolum();
		bolum5.setBolumId(6);
		bolum5.setBolumAdi("Pazarlama");

		Bolum bolum6 = new Bolum();
		bolum6.setBolumId(7);
		bolum6.setBolumAdi("İletisim");

		Bolum bolum7 = new Bolum();
		bolum7.setBolumId(8);
		bolum7.setBolumAdi("Yardimci Hizmet");

		Bolum bolum8 = new Bolum();
		bolum8.setBolumId(9);
		bolum8.setBolumAdi("Developer");

		Personel personel1 = new Personel();
		personel1.setPersonelId(127);
		personel1.setAdi("Sedat");
		personel1.setSoyadi("Kurnali");
		personel1.setTcKimlikNo("12345678911");
		personel1.setTelefonNo("535 535 35 35");
		personel1.setDogumTarihi(LocalDate.of(1979, 1, 1));
		personel1.setBolum(bolum8);

		Personel personel2 = new Personel();
		personel2.setPersonelId(128);
		personel2.setAdi("Recep");
		personel2.setSoyadi("Kardes");
		personel2.setTcKimlikNo("12345678912");
		personel2.setTelefonNo("555 555 55 55");
		personel2.setDogumTarihi(LocalDate.of(1990, 10, 29));
		personel2.setBolum(bolum1);

		Personel personel3 = new Personel();
		personel3.setPersonelId(129);
		personel3.setAdi("İsmail");
		personel3.setSoyadi("Akdoğan");
		personel3.setTcKimlikNo("12345678913");
		personel3.setTelefonNo("532 201 01 01");
		personel3.setDogumTarihi(LocalDate.of(1996, 04, 23));
		personel3.setBolum(bolum1);

		Personel personel4 = new Personel();
		personel4.setPersonelId(130);
		personel4.setAdi("Hakki");
		personel4.setSoyadi("Ocal");
		personel4.setTcKimlikNo("12345678914");
		personel4.setTelefonNo("531 333 22 11");
		personel4.setDogumTarihi(LocalDate.of(1985, 05, 19));
		personel4.setBolum(bolum7);

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Bolum.class)
				.addAnnotatedClass(Personel.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

//		session.save(bolum1);
//		session.save(bolum2);
//		session.save(bolum3);
//		session.save(bolum4);
//		session.save(bolum5);
//		session.save(bolum6);
//		session.save(bolum7);
//		session.save(bolum8);

//		session.save(personel1);
//		session.save(personel2);
//		session.save(personel3);
//		session.save(personel4);

		tx.commit();
		session.close();
		sf.close();
	}

}
