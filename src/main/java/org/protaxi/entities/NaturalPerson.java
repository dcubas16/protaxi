package org.protaxi.entities;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.protaxi.dto.NaturalPersonDTO;

@Entity
@Table(name = "NATURAL_PERSON")
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
public class NaturalPerson extends Client {

	private static final long serialVersionUID = -3861872839322143547L;

	@Column(name = "LAST_NAME", nullable = true)
	private String lastName;

	@Column(name = "SECOND_LAST_NAME", nullable = true)
	private String secondLastName;

	@Column(name = "NAME", nullable = true)
	private String name;

	@Column(name = "PHONE_NUMBER", nullable = true)
	private String phoneNumber;

	@Column(name = "CELLPHONE_NUMBER", nullable = true)
	private String cellphoneNumber;

	@Column(name = "HOME_ADDRESS", nullable = true)
	private String homeAddress;

	@Column(name = "BIRTHDATE", nullable = true)
	private Date birthDate;

	public NaturalPerson() {
		super();
	}
	
	public NaturalPerson(String lastName, String secondLastName, String name, String phoneNumber,
			String cellphoneNumber, String homeAddress, Date birthDate) {
		super();
		this.lastName = lastName;
		this.secondLastName = secondLastName;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.cellphoneNumber = cellphoneNumber;
		this.homeAddress = homeAddress;
		this.birthDate = birthDate;
	}



	public NaturalPerson(int id, int identityDocTypeId, String identityDoc, String email, String nickName, String photo,
			String password, String countryId, String phoneNumber, String lastName, String secondLastName, String name,
			String phoneNumber2, String cellphoneNumber, String homeAddress, Date birthDate) {
		super(id, identityDocTypeId, identityDoc, email, nickName, photo, password, countryId, phoneNumber);
		this.lastName = lastName;
		this.secondLastName = secondLastName;
		this.name = name;
		this.phoneNumber = phoneNumber2;
		this.cellphoneNumber = cellphoneNumber;
		this.homeAddress = homeAddress;
		this.birthDate = birthDate;
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

	public Client getNaturalPerson(NaturalPersonDTO naturalPersonDTO) {
		this.setId(naturalPersonDTO.getId());
		this.setIdentityDocTypeId(naturalPersonDTO.getIdentityDocTypeId());
		this.setIdentityDoc(naturalPersonDTO.getIdentityDoc());
		this.setEmail(naturalPersonDTO.getEmail());
		this.setNickName(naturalPersonDTO.getNickName());
		this.setPhoto(naturalPersonDTO.getPhoto());
		this.lastName = naturalPersonDTO.getLastName();
		this.secondLastName = naturalPersonDTO.getLastName();
		this.name = naturalPersonDTO.getName();
		this.phoneNumber = naturalPersonDTO.getPhoneNumber();
		this.cellphoneNumber = naturalPersonDTO.getCellphoneNumber();
		this.homeAddress = naturalPersonDTO.getHomeAddress();
		this.birthDate =  naturalPersonDTO.getBirthDate();
		this.countryId = naturalPersonDTO.getCountryId();
		this.setPassword(naturalPersonDTO.getPassword());

		return this;
	}

	public boolean equals(NaturalPerson naturalPerson) {
		return this.getId() == naturalPerson.getId()
				&& this.getIdentityDocTypeId() == naturalPerson.getIdentityDocTypeId()
				&& this.getIdentityDoc().equals(naturalPerson.getIdentityDoc())
				&& this.getEmail().equals(naturalPerson.getEmail())
				&& this.getNickName().equals(naturalPerson.getNickName())
				&& this.getPhoto().equals(naturalPerson.getPhoto())
				&& this.getLastName().equals(naturalPerson.getLastName())
				&& this.getSecondLastName().equals(naturalPerson.getSecondLastName())
				&& this.getName().equals(naturalPerson.getName())
				&& this.getPhoneNumber().equals(naturalPerson.getPhoneNumber())
				&& this.getCellphoneNumber().equals(naturalPerson.getCellphoneNumber())
				&& this.getHomeAddress().equals(naturalPerson.getHomeAddress());
	}

}
