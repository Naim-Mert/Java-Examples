package Entitiy;

import java.time.LocalDate;

public class Customer {
	
	
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String natiolnalityId;
	

	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String natiolnalityId) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.natiolnalityId = natiolnalityId;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNatiolnalityId() {
		return natiolnalityId;
	}
	public void setNatiolnalityId(String natiolnalityId) {
		this.natiolnalityId = natiolnalityId;
	}
	
	
	
	
	
	
	
}
