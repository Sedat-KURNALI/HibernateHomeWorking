package com.hb01.evdeCalisma01;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DataHQLQuerries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Bolum.class)
				.addAnnotatedClass(Personel.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		System.out.println("Bolum tablosundaki bütun sutunları ekrana yazdıran sorgu");

		String hqlQuery01 = "FROM Bolum";
		List<Bolum> resultList01 = session.createQuery(hqlQuery01, Bolum.class).getResultList();
		for (Object w : resultList01) {
			System.out.println(w + " ");
		}

		System.out.println("=================");
		System.out.println("Bolum tablosundaki id si 1 olan bolumlerin bilgisini ekrana yazdıran sorgu");

		Bolum bolum1 = session.get(Bolum.class, 1);
		System.out.println(bolum1.getBolumId() + " " + bolum1.getBolumAdi());

		System.out.println("=================");

		
		tx.commit();
		session.close();
		sf.close();
	}

}
