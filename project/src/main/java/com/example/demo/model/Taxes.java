package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "taxtable")
public class Taxes {
	
	  @Id
      private int id;
      private String taxpayername;
      private int gstnumber;
      private int aadhar;
      private int gst;
      private int pan;
      private int incometax;
      private int cess;
      private int customs;
      
	public Taxes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Taxes(int id, String taxpayername, int gstnumber, int aadhar, int gst, int pan, int incometax, int cess,
			int customs) {
		super();
		this.id = id;
		this.taxpayername = taxpayername;
		this.gstnumber = gstnumber;
		this.aadhar = aadhar;
		this.gst = gst;
		this.pan = pan;
		this.incometax = incometax;
		this.cess = cess;
		this.customs = customs;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaxpayername() {
		return taxpayername;
	}
	public void setTaxpayername(String taxpayername) {
		this.taxpayername = taxpayername;
	}
	public int getGstnumber() {
		return gstnumber;
	}
	public void setGstnumber(int gstnumber) {
		this.gstnumber = gstnumber;
	}
	public int getAadhar() {
		return aadhar;
	}
	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}
	public int getGst() {
		return gst;
	}
	public void setGst(int gst) {
		this.gst = gst;
	}
	public int getPan() {
		return pan;
	}
	public void setPan(int pan) {
		this.pan = pan;
	}
	public int getIncometax() {
		return incometax;
	}
	public void setIncometax(int incometax) {
		this.incometax = incometax;
	}
	public int getCess() {
		return cess;
	}
	public void setCess(int cess) {
		this.cess = cess;
	}
	public int getCustoms() {
		return customs;
	}
	public void setCustoms(int customs) {
		this.customs = customs;
	}
}
