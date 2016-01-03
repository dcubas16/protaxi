package org.protaxi.dto;

import java.io.Serializable;
import java.util.Date;

public class NaturalPersonDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5434906015424590108L;

	private int id;

	private int identityDocTypeId;

	private String identityDoc;

	private String email;
	
	private String nickName;
	
	private String photo;
	
	private String lastName;
	
	private String secondLastName;
	
	private String name;
	
	private String phoneNumber;
	
	private String cellphoneNumber;
	
	private String homeAddress;
	
	private Date birthDate;

//	public NaturalPersonDTO(int identityDocTypeId, String identityDoc, String email, String nickName, String photo,
//			String lastName, String secondLastName, String name, String phoneNumber, String cellphoneNumber,
//			String homeAddress, Date birthDate) {
//		super();
//		this.identityDocTypeId = identityDocTypeId;
//		this.identityDoc = identityDoc;
//		this.email = email;
//		this.nickName = nickName;
//		this.photo = photo;
//		this.lastName = lastName;
//		this.secondLastName = secondLastName;
//		this.name = name;
//		this.phoneNumber = phoneNumber;
//		this.cellphoneNumber = cellphoneNumber;
//		this.homeAddress = homeAddress;
//		this.birthDate = birthDate;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdentityDocTypeId() {
		return identityDocTypeId;
	}

	public void setIdentityDocTypeId(int identityDocTypeId) {
		this.identityDocTypeId = identityDocTypeId;
	}

	public String getIdentityDoc() {
		return identityDoc;
	}

	public void setIdentityDoc(String identityDoc) {
		this.identityDoc = identityDoc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
