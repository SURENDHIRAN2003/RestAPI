package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="audittable")
public class AuditTable {
     
	@Id
	private int id;
	private String name;
	private int gstno;
	private int revenue;
	private int profit;
	private int tax;
	private int profitaftertax;
	
	public AuditTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuditTable(int id, String name, int gstno, int revenue, int profit, int tax, int profitaftertax) {
		super();
		this.id = id;
		this.name = name;
		this.gstno = gstno;
		this.revenue = revenue;
		this.profit = profit;
		this.tax = tax;
		this.profitaftertax = profitaftertax;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGstno() {
		return gstno;
	}

	public void setGstno(int gstno) {
		this.gstno = gstno;
	}

	public int getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getProfitaftertax() {
		return profitaftertax;
	}

	public void setProfitaftertax(int profitaftertax) {
		this.profitaftertax = profitaftertax;
	}
	
	
	
	
	
}
