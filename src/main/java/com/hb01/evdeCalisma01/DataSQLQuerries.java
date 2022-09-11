package com.hb01.evdeCalisma01;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DataSQLQuerries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Bolum.class)
				.addAnnotatedClass(Personel.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		System.out.println("Bolum tablosundaki bütun sutunları ekrana yazdıran sorgu");

		String query01 = "SELECT * FROM bolum";

		List<Object[]> resultList1 = session.createSQLQuery(query01).getResultList();

		for (Object[] objects : resultList1) {
			for (Object w : objects) {
				System.out.print("   " + w);
			}
			System.out.println();
		}
		System.out.println("=================");

		System.out.println("Personel tablosundaki bütun sutunları ekrana yazdıran sorgu");

		String query02 = "SELECT * FROM personel";

		List<Object[]> resultList2 = session.createSQLQuery(query02).getResultList();

		for (Object[] objects : resultList2) {
			System.out.println(Arrays.toString(objects));
		}
		System.out.println("=================");
		System.out.println("Personel tablosundaki kişilerin adını soyadını ve bolum adını ekrana yazdıran sorgu");

		String query03 = "select p.personel_adi ,p.personel_soyadi ,b.bolum_adi  "
				+ "from bolum b ,personel p "
				+ "where b.bolum_id =p.bolum_id  ;";

		List<Object[]> resultList3 = session.createSQLQuery(query03).getResultList();

		for (Object[] objects : resultList3) {
			System.out.println(Arrays.toString(objects));
		}
		System.out.println("=================");
		System.out.println("Personel tablosundaki kişilerin adını soyadını ve bolum adını ekrana yazdıran sorgu JOIN ile");

		String query04 = "select p.personel_adi ,p.personel_soyadi ,b.bolum_adi  \r\n"
				+ "from personel p inner join bolum b on b.bolum_id =p.bolum_id  ;";

		List<Object[]> resultList4 = session.createSQLQuery(query04).getResultList();

		for (Object[] objects : resultList4) {
			System.out.println(Arrays.toString(objects));
		}
		System.out.println("=================");
		tx.commit();
		session.close();
		sf.close();
	}

}
