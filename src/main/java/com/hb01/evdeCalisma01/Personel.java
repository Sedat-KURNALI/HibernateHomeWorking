package com.hb01.evdeCalisma01;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Personel {

	@Id
	@Column(name = "id")
	private int personelId;

	@Column(name = "personel_adi",length=25)
	private String adi;

	@Column(name = "personel_soyadi",length=25)
	private String soyadi;

	@Column(name = "tel_no",length=17)
	private String telefonNo;

	@Column(name = "tc_kimlik",length=11)
	private String tcKimlikNo;

	@Column(name = "d_tarihi")
	private LocalDate dogumTarihi;

	@OneToOne
	@JoinColumn(name = "bolum_id")
	private Bolum bolum;

	public int getPersonelId() {
		return personelId;
	}

	public String getAdi() {
		return adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public String getTelefonNo() {
		return telefonNo;
	}

	public String getTcKimlikNo() {
		return tcKimlikNo;
	}

	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}

	public Bolum getBolum() {
		return bolum;
	}

	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}

	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public void setBolum(Bolum bolum) {
		this.bolum = bolum;
	}

	@Override
	public String toString() {
		return "Personel [personelId=" + personelId + ", adi=" + adi + ", soyadi=" + soyadi + ", telefonNo=" + telefonNo
				+ ", tcKimlikNo=" + tcKimlikNo + ", dogumTarihi=" + dogumTarihi + ", bolum=" + bolum + "]";
	}

}