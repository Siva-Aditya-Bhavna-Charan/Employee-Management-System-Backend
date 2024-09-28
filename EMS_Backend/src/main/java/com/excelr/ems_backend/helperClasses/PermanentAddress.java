package com.excelr.ems_backend.helperClasses;

import jakarta.persistence.Embeddable;

@Embeddable

public class PermanentAddress {
	private String perm_city;
	private String perm_line1;
	private String perm_line2;
	private int perm_pincode;

	public String getPerm_city() {
		return perm_city;
	}

	public void setPerm_city(String perm_city) {
		this.perm_city = perm_city;
	}

	public String getPerm_line1() {
		return perm_line1;
	}

	public void setPerm_line1(String perm_line1) {
		this.perm_line1 = perm_line1;
	}

	public String getPerm_line2() {
		return perm_line2;
	}

	public void setPerm_line2(String perm_line2) {
		this.perm_line2 = perm_line2;
	}

	public int getPerm_pincode() {
		return perm_pincode;
	}

	public void setPerm_pincode(int perm_pincode) {
		this.perm_pincode = perm_pincode;
	}

	@Override
	public String toString() {
		return "PermanentAddress [perm_city=" + perm_city + ", perm_line1=" + perm_line1 + ", perm_line2=" + perm_line2
				+ ", perm_pincode=" + perm_pincode + "]";
	}

	public PermanentAddress() {
		super();
	}

}
