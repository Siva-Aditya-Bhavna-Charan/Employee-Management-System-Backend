package com.excelr.ems_backend.models;

import java.util.Date;

import com.excelr.ems_backend.helperClasses.CurrentAddress;
import com.excelr.ems_backend.helperClasses.PermanentAddress;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity

public class PersonalDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String fullName;
	private Date dob;
	private String Gender;
	private int age;
	@Embedded
	private PermanentAddress permanentAddress;
	@Embedded
	private CurrentAddress currentAddress;
	private String mobile;
	private String personalMail;
	private String emergencyContactName;
	private String emergencyContact;

	@OneToOne(mappedBy = "personalDetails")
	@JsonBackReference
	private EmployeeRecord employee;

	public Long getId() {
		return id;
	}


	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public PermanentAddress getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(PermanentAddress permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public CurrentAddress getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(CurrentAddress currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPersonalMail() {
		return personalMail;
	}

	public void setPersonalMail(String personalMail) {
		this.personalMail = personalMail;
	}

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public EmployeeRecord getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeRecord employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "PersonalDetails [id=" + id + ", fullName=" + fullName + ", dob=" + dob + ", Gender=" + Gender + ", age="
				+ age + ", permanentAddress=" + permanentAddress + ", currentAddress=" + currentAddress + ", mobile="
				+ mobile + ", personalMail=" + personalMail + ", emergencyContactName=" + emergencyContactName
				+ ", emergencyContact=" + emergencyContact + ", employee=" + employee + "]";
	}

	public PersonalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
