package org.protaxi.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "NATURAL_PERSON")
@AttributeOverrides({
	@AttributeOverride(name="identityDocTypeId", column=@Column(name="IDENTITY_DOC_TYPE_ID")),
	@AttributeOverride(name="identityDoc", column=@Column(name="IDENTITY_DOC")),
	@AttributeOverride(name="email", column=@Column(name="EMAIL"))})
public class LegalEntity  extends Client{

	private static final long serialVersionUID = -3861872839322143547L;

	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="SECOND_LAST_NAME")
	private String secondLastName;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name="CELLPHONE_NUMBER")
	private String cellphoneNumber;
	
	@Column(name="HOME_ADDRESS")
	private String homeAddress;


	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSecondLastName() {
		return secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCellphoneNumber() {
		return cellphoneNumber;
	}

	public void setCellphoneNumber(String cellphoneNumber) {
		this.cellphoneNumber = cellphoneNumber;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	
}
