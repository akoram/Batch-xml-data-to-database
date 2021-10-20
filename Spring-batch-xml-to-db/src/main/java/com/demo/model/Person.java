package com.demo.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {

		@Id
	@GeneratedValue
	private Integer personId;
		@Column(name="first_name")
	private String firstName;
		@Column(name="last_name")
	private String lastName;
		@Column(name="code")
	private Long code;
		@Column(name="salary")
	private double salary;
		@Column(name="fresher")
	private boolean fresher;
		//@Column(name="first_name")
	//private Date jdate;
		@Column(name="email")
	private String email;
		@Column(name="age")
	private Integer age;
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean getFresher() {
		return fresher;
	}
	public void setFresher(boolean fresher) {
		this.fresher = fresher;
	}
//	public Date getJdate() {
//		return jdate;
//	}
//	public void setJdate(Date jdate) {
//		this.jdate = jdate;
//	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + ", code=" + code
				+ ", salary=" + salary + ", fresher=" + fresher + ", email=" + email + ", age=" + age + "]";
	}
		
	
}