package com.te.dtos;

import java.io.Serializable;

public class UserDetails implements Serializable {

	private int empId;
	private String userName;
	private String passkey;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasskey() {
		return passkey;
	}

	public void setPasskey(String passkey) {
		this.passkey = passkey;
	}

	public UserDetails(int empId, String userName, String passkey) {
		super();
		this.empId = empId;
		this.userName = userName;
		this.passkey = passkey;
	}

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserDetails [empId=" + empId + ", userName=" + userName + ", passkey=" + passkey + "]";
	}

}
