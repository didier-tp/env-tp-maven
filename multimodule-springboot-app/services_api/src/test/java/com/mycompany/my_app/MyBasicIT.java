package com.mycompany.my_app;


import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestClient;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 ...IT or IT... = IntegrationTest launch by maven failsafe plugin
 */
class MyBasicIT {


	@Test
	public void testAllNewsNotNull(){
		RestClient restClient = RestClient.create();
		String uriBase = "http://localhost:8181/multimodule-springboot-app/rest/api-news/v1";
		String resultAsJsonString = restClient.get()
				.uri(uriBase + "/news")
				.retrieve()
				.body(String.class);
		System.out.println("MyBasicIT.testAllNewsNotNull resultAsJsonString="+resultAsJsonString);
		assertNotNull(resultAsJsonString);
	}

}
