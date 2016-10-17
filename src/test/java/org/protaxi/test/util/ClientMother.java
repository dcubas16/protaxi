package org.protaxi.test.util;

import java.util.Date;

import org.protaxi.dto.NaturalPersonDTO;
import org.protaxi.entities.Client;
import org.protaxi.entities.LegalEntity;
import org.protaxi.entities.NaturalPerson;

public class ClientMother {

	public static NaturalPerson getNaturalPersonClient() {
		return new NaturalPerson(2, 1, "identityDoc_1", "email_1", "nickName_1",
				"photo_1", "password1", "country_id1", "phone_number_1", "lastName_1", "secondLastName_1", "name_1",
				"phoneNumber_1", "cellphoneNumber_1", "homeAddress_1",
				new Date());
	}
	
	public static NaturalPerson getExistingNaturalPersonClient() {
		return new NaturalPerson(0, 0, "identityDoc_0", "email_0", "nickName_0",
				"photo_0", "password0", "country_id0", "phone_number_0", "lastName_0", "secondLastName_0", "name_0",
				"phoneNumber_0", "cellphoneNumber_0", "homeAddress_0",
				new Date());
	}

	public static Client getIncompleteNaturalPersonClient() {
		return new NaturalPerson(1, 1, null, "email_1", "nickName_1",
				"photo_1", "password1", "country_id1", "phone_number_1", "lastName_1", "secondLastName_1", "name_1",
				"phoneNumber_1", "cellphoneNumber_1", "homeAddress_1",
				new Date());
	}

	public static Client getWrongDateOfNaturalPersonClient() {
		return new NaturalPerson(1, 1, null, "email_1", "nickName_1",
				"photo_1", "password1", "country_id1", "phone_number_1", "lastName_1", "secondLastName_1", "name_1",
				"phoneNumber_1", "cellphoneNumber_1", "homeAddress_1",
				new Date());
	}
	
	public static NaturalPerson getFirstNaturalPersonClient() {
		return new NaturalPerson(0, 0, "identityDoc_0", "email_0", "nickName_0",
				"photo_0", "password0", "country_id0", "phone_number_0", "lastName_0"
				, "secondLastName_0", "name_0",	"phoneNumber_0", "cellphoneNumber_0"
				, "homeAddress_0",
				new Date());
	}

	public static Client getLegalEntityClient() {
		return new LegalEntity(1, 1, "identityDoc_1", "email_1", "nickName_1",
				"photo_1", "password0", "country_id0", "phone_number_0", "businessName_1", "contactPhoneNumber_1",
				"contactCellphoneNumber_1", "address_1");
	}

	public static Client getIncompleteLegalEntityClient() {
		return new LegalEntity(1, 1, null, null, "nickName_1",
				"photo_1", "password0", "country_id0", "phone_number_0", "businessName_1", "contactPhoneNumber_1",
				"contactCellphoneNumber_1", "address_1");
	}
	
	public static NaturalPersonDTO getNaturalPersonDto() {
		NaturalPersonDTO naturalPersonDTO = new NaturalPersonDTO();
		naturalPersonDTO.setIdentityDoc("1");
		naturalPersonDTO.setIdentityDocTypeId(1);
		naturalPersonDTO.setEmail("email_1");
		naturalPersonDTO.setNickName("nickName_1");
		naturalPersonDTO.setPhoto("photo_1");
		naturalPersonDTO.setLastName("lastName_1");
		naturalPersonDTO.setSecondLastName("secondLastName_1");
		naturalPersonDTO.setName("name_1");
		naturalPersonDTO.setPhoneNumber("phoneNumber_1");
		naturalPersonDTO.setCellphoneNumber("cellphoneNumber_1");
		naturalPersonDTO.setHomeAddress("homeAddress_1");
		naturalPersonDTO.setBirthDate(null);
		naturalPersonDTO.setCountryId("countryId_1");
		naturalPersonDTO.setPassword("password_1");
		
		return naturalPersonDTO;
	}

}
