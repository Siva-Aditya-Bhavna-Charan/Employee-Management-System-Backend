package com.excelr.ems_backend.helperClasses;

import java.util.Date;

import jakarta.persistence.Embeddable;

@Embeddable
public class EmploymentHistory {
	private String companyName;
	private Date joiningDate;
	private Date endDate;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public EmploymentHistory() {
		super();
	}

	@Override
	public String toString() {
		return "EmploymentHistory [companyName=" + companyName + ", joiningDate=" + joiningDate + ", endDate=" + endDate
				+ "]";
	}

}
