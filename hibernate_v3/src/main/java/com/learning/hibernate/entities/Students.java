package com.learning.hibernate.entities;

public class Students {
	int Id;
	String Name;
	String EmailId;
	String MobileNo;
	int marks;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Students [RollNo=" + Id + ", Name=" + Name + ", EmailId="
				+ EmailId + ", MobileNo=" + MobileNo + ", marks=" + marks + "]";
	}
}
