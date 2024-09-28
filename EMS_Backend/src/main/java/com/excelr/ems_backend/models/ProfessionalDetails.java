package com.excelr.ems_backend.models;

import java.util.Date;
import java.util.List;

import com.excelr.ems_backend.helperClasses.CurrentAddress;
import com.excelr.ems_backend.helperClasses.EmploymentHistory;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity

public class ProfessionalDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String employmentCode;
	private String companyMail;
	private String officePhone;
	@Embedded
	private CurrentAddress officeAddress;
	private Long reportManagerEmployeeCode;
	private String reportManagerEmployeeMail;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private List<EmploymentHistory> employmentHistory;
	private Date dateOfJoining;
	private String hrName;
	
	@OneToOne(mappedBy ="professionalDetails" )
	@JsonBackReference
	private EmployeeRecord employee;

	public Long getId() {
		return id;
	}

	public String getEmploymentCode() {
		return employmentCode;
	}

	public void setEmploymentCode(String employmentCode) {
		this.employmentCode = employmentCode;
	}

	public String getCompanyMail() {
		return companyMail;
	}

	public void setCompanyMail(String companyMail) {
		this.companyMail = companyMail;
	}

	public String getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public CurrentAddress getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(CurrentAddress officeAddress) {
		this.officeAddress = officeAddress;
	}

	public Long getReportManagerEmployeeCode() {
		return reportManagerEmployeeCode;
	}

	public void setReportManagerEmployeeCode(Long reportManagerEmployeeCode) {
		this.reportManagerEmployeeCode = reportManagerEmployeeCode;
	}

	public String getReportManagerEmployeeMail() {
		return reportManagerEmployeeMail;
	}

	public void setReportManagerEmployeeMail(String reportManagerEmployeeMail) {
		this.reportManagerEmployeeMail = reportManagerEmployeeMail;
	}

	public List<EmploymentHistory> getEmploymentHistory() {
		return employmentHistory;
	}

	public void setEmploymentHistory(List<EmploymentHistory> employmentHistory) {
		this.employmentHistory = employmentHistory;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getHrName() {
		return hrName;
	}

	public void setHrName(String hrName) {
		this.hrName = hrName;
	}

	public EmployeeRecord getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeRecord employee) {
		this.employee = employee;
	}

	public ProfessionalDetails() {
		super();
	}

	@Override
	public String toString() {
		return "ProfessionalDetails [id=" + id + ", employmentCode=" + employmentCode + ", companyMail=" + companyMail
				+ ", officePhone=" + officePhone + ", officeAddress=" + officeAddress + ", reportManagerEmployeeCode="
				+ reportManagerEmployeeCode + ", reportManagerEmployeeMail=" + reportManagerEmployeeMail
				+ ", employmentHistory=" + employmentHistory + ", dateOfJoining=" + dateOfJoining + ", hrName=" + hrName
				+ ", employee=" + employee + "]";
	}
	
	
	
	
}
