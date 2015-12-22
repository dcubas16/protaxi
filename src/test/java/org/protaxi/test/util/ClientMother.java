package org.protaxi.test.util;

import java.util.Date;

import org.protaxi.entities.Client;
import org.protaxi.entities.LegalEntity;
import org.protaxi.entities.NaturalPerson;

public class ClientMother {

	public static Client getNaturalPersonClient() {
		return new NaturalPerson(1, "identityDoc_1", "email_1", "nickName_1",
				"photo_1", "lastName_1", "secondLastName_1", "name_1",
				"phoneNumber_1", "cellphoneNumber_1", "homeAddress_1",
				new Date());
	}

	public static Client getIncompleteNaturalPersonClient() {

		return new NaturalPerson(1, null, null, "nickName_1", "photo_1",
				"lastName_1", "secondLastName_1", "name_1", "phoneNumber_1",
				"cellphoneNumber_1", "homeAddress_1", new Date());
	}

	public static Client getWrongDateOfNaturalPersonClient() {
		return new NaturalPerson(1, "identityDoc_1", "email_1", "nickName_1",
				"photo_1", "lastName_1", "secondLastName_1", "name_1",
				"phoneNumber_1", "cellphoneNumber_1", "homeAddress_1", null);
	}

	public static Client getLegalEntityClient() {
		return new LegalEntity(1, "identityDoc_1", "email_1", "nickName_1",
				"photo_1", "businessName_1", "contactPhoneNumber_1",
				"contactCellphoneNumber_1", "address_1");
	}

	public static Client getIncompleteLegalEntityClient() {
		return new LegalEntity(1, null, null, "nickName_1",
				"photo_1", "businessName_1", "contactPhoneNumber_1",
				"contactCellphoneNumber_1", "address_1");
	}

}
