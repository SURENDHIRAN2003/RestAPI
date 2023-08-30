package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="billpro")

public class AccEntity{
	
	@Id
	
	private int custid;
	private String custname;
	  private int billno;
	  private int amt;
	  private String buyer;
	  private String bank;
	  private String location;
	  private String commodity;
	
	  @OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "fkid")
	  private AuditTable at;
	  
	  @OneToMany(cascade=CascadeType.ALL)
	  @JoinColumn(name = "custid")
	  private List<Taxes> ta;

	public AccEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccEntity(int custid, String custname, int billno, int amt, String buyer, String bank, String location,
			String commodity, AuditTable at, List<Taxes> ta) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.billno = billno;
		this.amt = amt;
		this.buyer = buyer;
		this.bank = bank;
		this.location = location;
		this.commodity = commodity;
		this.at = at;
		this.ta = ta;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public int getBillno() {
		return billno;
	}

	public void setBillno(int billno) {
		this.billno = billno;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCommodity() {
		return commodity;
	}

	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}

	public AuditTable getAt() {
		return at;
	}

	public void setAt(AuditTable at) {
		this.at = at;
	}

	public List<Taxes> getTa() {
		return ta;
	}

	public void setTa(List<Taxes> ta) {
		this.ta = ta;
	}
      
	

	  
}
