package com.atul.coinCollection;

import java.time.LocalDate;

public class Coin {
	int coinId;
	String country;
	int yearofMinting ;
	double currentValue;
	double denomination ;
	LocalDate auireDate ;
	public Coin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coin(int coinId, String country, int yearofMinting, double currentValue, double tcurrentValue,
			LocalDate auireDate) {
		super();
		this.coinId = coinId;
		this.country = country;
		this.yearofMinting = yearofMinting;
		this.currentValue = currentValue;
		this.denomination =  tcurrentValue;
		this.auireDate = auireDate;
	}
	public int getCoinId() {
		return coinId;
	}
	public void setCoinId(int coinId) {
		this.coinId = coinId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getYearofMinting() {
		return yearofMinting;
	}
	public void setYearofMinting(int yearofMinting) {
		this.yearofMinting = yearofMinting;
	}
	public double getCurrentValue() {
		return currentValue;
	}
	public void setCurrentValue(double currentValue) {
		this.currentValue = currentValue;
	}
	public double getDenomination() {
		return denomination;
	}
	public void setDenomination(int denomination) {
		this.denomination = denomination;
	}
	public LocalDate getAuireDate() {
		return auireDate;
	}
	public void setAuireDate(LocalDate auireDate) {
		this.auireDate = auireDate;
	}
	@Override
	public String toString() {
		return "\n Coin [coinId=" + coinId + ", country=" + country + ", yearofMinting=" + yearofMinting
				+ ", currentValue=" + currentValue + ", denomination=" + denomination + ", auireDate=" + auireDate
				+ "]\n";
	}
	
	
}
