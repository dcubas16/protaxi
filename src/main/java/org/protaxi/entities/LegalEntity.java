package org.protaxi.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "LEGAL_ENTITY")
@AttributeOverrides({
	@AttributeOverride(name="identityDocTypeId", column=@Column(name="IDENTITY_DOC_TYPE_ID")),
	@AttributeOverride(name="identityDoc", column=@Column(name="IDENTITY_DOC")),
	@AttributeOverride(name="email", column=@Column(name="EMAIL"))})
public class LegalEntity  extends Client{

	private static final long serialVersionUID = -3861872839322143547L;

	@Column(name="LAST_NAME", nullable = false)
	private String businessName;
	
	@Column(name="PHONE_NUMBER", nullable = false)
	private String contactPhoneNumber;
	
	@Column(name="CELLPHONE_NUMBER", nullable = false)
	private String contactCellphoneNumber;
	
	@Column(name="HOME_ADDRESS")
	private String address;

	public LegalEntity() {
		super();
	}

	public LegalEntity(int id, int identityDocTypeId, String identityDoc,
			String email, String nickName, String photo, String businessName,
			String contactPhoneNumber, String contactCellphoneNumber,
			String address) {
		super(id, identityDocTypeId, identityDoc, email, nickName, photo);
		this.businessName = businessName;
		this.contactPhoneNumber = contactPhoneNumber;
		this.contactCellphoneNumber = contactCellphoneNumber;
		this.address = address;
	}

	public LegalEntity(int identityDocTypeId, String identityDoc, String email,
			String nickName, String photo, String businessName,
			String contactPhoneNumber, String contactCellphoneNumber,
			String address) {
		super(identityDocTypeId, identityDoc, email, nickName, photo);
		this.businessName = businessName;
		this.contactPhoneNumber = contactPhoneNumber;
		this.contactCellphoneNumber = contactCellphoneNumber;
		this.address = address;
	}

	public LegalEntity(String businessName, String contactPhoneNumber,
			String contactCellphoneNumber, String address) {
		super();
		this.businessName = businessName;
		this.contactPhoneNumber = contactPhoneNumber;
		this.contactCellphoneNumber = contactCellphoneNumber;
		this.address = address;
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
