package com.example.smallwebProj;

import java.sql.Date;

public class User {
	public String name;
	public String email;
	public String gender;
	public String password;
	public Date birthday;
	private boolean employed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public boolean isEmployed() {
		return employed;
	}
	public void setEmployed(boolean employed) {
		this.employed = employed;
	}
	@Override
	public String toString() {
		return "user [name=" + name + ", email=" + email + ", gender=" + gender + ", password=" + password
				+ ", birthdate=" + birthday + ", employed=" + employed + "]";
	}
	
	
}
