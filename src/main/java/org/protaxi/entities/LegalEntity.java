package org.protaxi.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "LEGAL_ENTITY")
@AttributeOverrides({ 
	@AttributeOverride(name = "identityDocTypeId", column = @Column(name = "IDENTITY_DOC_TYPE_ID") ),
	@AttributeOverride(name = "identityDoc", column = @Column(name = "IDENTITY_DOC") ),
	@AttributeOverride(name = "email", column = @Column(name = "EMAIL") ),
	@AttributeOverride(name = "nickName", column = @Column(name = "NICKNAME") ),
	@AttributeOverride(name = "photo", column = @Column(name = "PHOTO") ), 
	@AttributeOverride(name = "password", column = @Column(name = "PASSWORD") ), 
	@AttributeOverride(name = "country_id", column = @Column(name = "COUNTRY_ID") ), 
	@AttributeOverride(name = "phone_number", column = @Column(name = "PHONE_NUMBER") )
})

public class LegalEntity  extends Client{

	private static final long serialVersionUID = -3861872839322143547L;

	@Column(name="LAST_NAME", nullable = true)
	private String businessName;
	
	@Column(name="PHONE_NUMBER", nullable = true)
	private String contactPhoneNumber;
	
	@Column(name="CELLPHONE_NUMBER", nullable = true)
	private String contactCellphoneNumber;
	
	@Column(name="HOME_ADDRESS", nullable = true)
	private String address;

	public LegalEntity() {
		super();
	}

	public LegalEntity(int id, int identityDocTypeId, String identityDoc, String email, String nickName, String photo,
			String password, String countryId, String phoneNumber, String businessName, String contactPhoneNumber,
			String contactCellphoneNumber, String address) {
		super(id, identityDocTypeId, identityDoc, email, nickName, photo, password, countryId, phoneNumber);
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
