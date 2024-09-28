package com.excelr.ems_backend.helperClasses;

import jakarta.persistence.Embeddable;

@Embeddable
public class CurrentAddress {
	private String curr_city;
	private String curr_line1;
	private String curr_line2;
	private int curr_pincode;
	public String getCurr_city() {
		return curr_city;
	}
	public void setCurr_city(String curr_city) {
		this.curr_city = curr_city;
	}
	public String getCurr_line1() {
		return curr_line1;
	}
	public void setCurr_line1(String curr_line1) {
		this.curr_line1 = curr_line1;
	}
	public String getCurr_line2() {
		return curr_line2;
	}
	public void setCurr_line2(String curr_line2) {
		this.curr_line2 = curr_line2;
	}
	public int getCurr_pincode() {
		return curr_pincode;
	}
	public void setCurr_pincode(int curr_pincode) {
		this.curr_pincode = curr_pincode;
	}
	public CurrentAddress() {
		super();
	}
	@Override
	public String toString() {
		return "CurrentAddress [curr_city=" + curr_city + ", curr_line1=" + curr_line1 + ", curr_line2=" + curr_line2
				+ ", curr_pincode=" + curr_pincode + "]";
	}
	
}
