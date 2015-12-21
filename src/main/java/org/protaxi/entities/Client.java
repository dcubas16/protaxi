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
	private int id;

	@Column(name = "IDENTITY_DOC_TYPE_ID")
	private int identityDocTypeId;

	@Column(name="IDENTITY_DOC")
	private String identityDoc;

	@Column(name="EMAIL")
	private String email;
	
	public Client(int identityDocTypeId, String identityDoc, String email) {
		super();
		this.identityDocTypeId = identityDocTypeId;
		this.identityDoc = identityDoc;
		this.email = email;
	}

	public Client(int id, int identityDocTypeId, String identityDoc) {
		super();
		this.id = id;
		this.identityDocTypeId = identityDocTypeId;
		this.identityDoc = identityDoc;
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
}
