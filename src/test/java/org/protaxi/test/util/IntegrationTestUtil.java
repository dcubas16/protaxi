package org.protaxi.test.util;

import java.nio.charset.Charset;

import org.springframework.http.MediaType;
public class IntegrationTestUtil {

	public static final MediaType APPLICATION_JSON_UTF8 = new MediaType(MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));

//	public static byte[] convertObjectToJsonBytes(Object object) throws IOException {
//		ObjectMapper mapper = new ObjectMapper();
//		mapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
//		return mapper.writeValueAsBytes(object);
//	}
}
