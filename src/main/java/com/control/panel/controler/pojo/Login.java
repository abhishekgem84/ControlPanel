package com.control.panel.controler.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Login {
	@NotNull
	@Size(min=8,max=20)
	private String userName;
	@NotNull
	@Size(min=8,max=20)
	private char[] password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}

}
