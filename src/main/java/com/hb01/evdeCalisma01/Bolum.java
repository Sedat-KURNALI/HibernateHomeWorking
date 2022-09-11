package com.hb01.evdeCalisma01;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bolum {

	@Id
	@Column(name = "bolum_id")
	private int bolumId;

	@Column(name = "bolum_adi")
	private String bolumAdi;

	public int getBolumId() {
		return bolumId;
	}

	public String getBolumAdi() {
		return bolumAdi;
	}

	public void setBolumId(int bolumId) {
		this.bolumId = bolumId;
	}

	public void setBolumAdi(String bolumAdi) {
		this.bolumAdi = bolumAdi;
	}

	@Override
	public String toString() {
		return "Bolum [bolumId=" + bolumId + ", bolumAdi=" + bolumAdi + "]";
	}
	
	

}
