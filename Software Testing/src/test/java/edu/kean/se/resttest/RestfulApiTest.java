package edu.kean.se.resttest;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestfulApiTest {
	@Test
	public void testIEXCloud() {

		when().
				get("https://api.iextrading.com/1.0/tops").
		then().
				statusCode(200);
	}
	
	@Test
	public void whenValidateResponseTime_thenSuccess() {
	    when().get("https://api.iextrading.com/1.0/tops").then().time(lessThan(5000l));
	}
}
