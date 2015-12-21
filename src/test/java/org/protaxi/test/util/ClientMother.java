package org.protaxi.test.util;

import org.protaxi.entities.Client;
import org.protaxi.entities.NaturalPerson;

public class ClientMother {

	public static Client getNaturalPersonClient() {
		return new NaturalPerson(1, "1", "1@1", "1", "1", "1", "1", "1", "1");
	}

}
