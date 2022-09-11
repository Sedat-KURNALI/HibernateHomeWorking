package com.hb01.evdeCalisma01;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Personel {

	@Id
	@Column(name = "id")
	private int personelId;

	@Column(name = "personel_adi")
	private String adi;
	
	@Column(name = "personel_soyadi")
	private String soyadi;
	
	@Column(name = "tel_no")
	private String telefonNo;
	
	@Column(name = "tc_kimlik")
	private String tcKimlikNo;
	
	@Column(name = "d_tarihi")
	private Date dogumTarihi;
	
	@OneToOne
	@Column(name = "bolum_id")
	private int bolumId;

}