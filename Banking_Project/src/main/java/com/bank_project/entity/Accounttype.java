package com.bank_project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "accounttype")
public class Accounttype {
	@Id
	long accountnumber;
	@Column 
	int Savingaccount;
	@Column
	int currentaccount;
	@Column
	int withdraw;
	@Column 
	int currentbalance;
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getSavingaccount() {
		return Savingaccount;
	}
	public void setSavingaccount(int savingaccount) {
		Savingaccount = savingaccount;
	}
	public int getCurrentaccount() {
		return currentaccount;
	}
	public void setCurrentaccount(int currentaccount) {
		this.currentaccount = currentaccount;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	public int getCurrentbalance() {
		return currentbalance;
	}
	public void setCurrentbalance(int currentbalance) {
		this.currentbalance = currentbalance;
	}
	public Accounttype() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accounttype(long accountnumber, int savingaccount, int currentaccount, int withdraw, int currentbalance) {
		super();
		this.accountnumber = accountnumber;
		Savingaccount = savingaccount;
		this.currentaccount = currentaccount;
		this.withdraw = withdraw;
		this.currentbalance = currentbalance;
	}
	@Override
	public String toString() {
		return "Accounttype [accountnumber=" + accountnumber + ", Savingaccount=" + Savingaccount + ", currentaccount="
				+ currentaccount + ", withdraw=" + withdraw + ", currentbalance=" + currentbalance
				+ ", getAccountnumber()=" + getAccountnumber() + ", getSavingaccount()=" + getSavingaccount()
				+ ", getCurrentaccount()=" + getCurrentaccount() + ", getWithdraw()=" + getWithdraw()
				+ ", getCurrentbalance()=" + getCurrentbalance() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
