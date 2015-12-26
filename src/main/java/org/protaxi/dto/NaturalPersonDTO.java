package org.protaxi.dto;

public class NaturalPersonDTO {
	private int id;

	private int identityDocTypeId;

	private String identityDoc;

	private String email;
	
	private String nickName;
	
	private String photo;
	
	private String businessName;
	
	private String contactPhoneNumber;
	
	private String contactCellphoneNumber;
	
	private String address;

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

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}

	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	public String getContactCellphoneNumber() {
		return contactCellphoneNumber;
	}

	public void setContactCellphoneNumber(String contactCellphoneNumber) {
		this.contactCellphoneNumber = contactCellphoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
