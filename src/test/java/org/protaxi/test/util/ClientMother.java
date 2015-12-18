package org.protaxi.test.util;

import org.protaxi.entities.Client;

public class ClientMother {

	public static Client getNaturalPersonClient() {
		return new Client(1,"123456");
	}

}
