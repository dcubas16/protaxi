package org.protaxi.test.util;

import java.util.Date;

import org.protaxi.entities.Client;
import org.protaxi.entities.NaturalPerson;

public class ClientMother {

	public static Client getNaturalPersonClient() {
		return new NaturalPerson(1, "identityDoc_1", "email_1", "nickName_1", "photo_1", "lastName_1", "secondLastName_1",
				"name_1", "phoneNumber_1", "cellphoneNumber_1", "homeAddress_1", new Date());
	}

}
