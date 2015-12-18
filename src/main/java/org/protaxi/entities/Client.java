package org.protaxi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column
	private int id;

	@Column
	private int identityDocTypeId;

	@Column
	private String identityDoc;

	public Client(int identityDocTypeId, String identityDoc) {
		super();
		this.identityDocTypeId = identityDocTypeId;
		this.identityDoc = identityDoc;
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
}
