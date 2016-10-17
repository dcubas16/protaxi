package org.protaxi.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "CLIENT", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ID")})
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Client implements Serializable {

	private static final long serialVersionUID = 6130024455131371368L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name="ID")
	public int id;

	@Column(name = "IDENTITY_DOC_TYPE_ID", nullable = true)
	public int identityDocTypeId;

	@Column(name="IDENTITY_DOC", nullable = true)
	public String identityDoc;

	@Column(name="EMAIL",unique = true, nullable = false)
	public String email;
	
	@Column(name="NICKNAME")
	public String nickName;
	
	@Column(name="PHOTO", nullable = true)
	public String photo;
	
	@Column(name="PASSWORD",nullable = false)
	public String password; 
	
	@Column(name="COUNTRY_ID",nullable = false)
	public String countryId;
	
	@Column(name="PHONE_NUMBER ",nullable = false)
	public String phoneNumber;
	
	public Client() {
		super();
	}

	public Client(int id, int identityDocTypeId, String identityDoc, String email, String nickName, String photo,
			String password, String countryId, String phoneNumber) {
		super();
		this.id = id;
		this.identityDocTypeId = identityDocTypeId;
		this.identityDoc = identityDoc;
		this.email = email;
		this.nickName = nickName;
		this.photo = photo;
		this.password = password;
		this.countryId = countryId;
		this.phoneNumber = phoneNumber;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
