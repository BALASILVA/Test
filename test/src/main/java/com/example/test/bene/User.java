package com.example.test.bene;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long userId;
	private String userName;
	private Long age;
	private String email;
	@OneToMany(targetEntity = Address.class,cascade = { CascadeType.ALL })
	private List<Address> address;

	public User() {
		// TODO Auto-generated constructor stub
	}


	
	public Long getUserId() {
		return userId;
	}



	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public Long getAge() {
		return age;
	}



	public void setAge(Long age) {
		this.age = age;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public List<Address> getAddress() {
		return address;
	}



	public void setAddress(List<Address> address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", age=" + age + ", email=" + email + "]";
	}

}
