package com.excelr.ems_backend.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class FinanceDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String panCard;
	private String aadharCard;
	private String bankName;
	private String branch;
	private String ifscCode;
	private int ctcBreakup;

	@OneToOne(mappedBy = "financeDetails")
	@JsonBackReference
	private EmployeeRecord employee;

	public Long getId() {
		return id;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public int getCtcBreakup() {
		return ctcBreakup;
	}

	public void setCtcBreakup(int ctcBreakup) {
		this.ctcBreakup = ctcBreakup;
	}

	public EmployeeRecord getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeRecord employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "FinanceDetails [id=" + id + ", panCard=" + panCard + ", aadharCard=" + aadharCard + ", bankName="
				+ bankName + ", branch=" + branch + ", ifscCode=" + ifscCode + ", ctcBreakup=" + ctcBreakup
				+ ", employee=" + employee + "]";
	}

	public FinanceDetails() {
		super();
	}

}
