package restAssuredPKG;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LearnApiTest {
	Response response;
	Response postResponse;
	JsonPath jsonPathEvaluator;
	RequestSpecification httpsRequest;

	@BeforeGroups("Get_MethodTest")
	public void get_WeatherAPI() {
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		httpsRequest = RestAssured.given();
		response = httpsRequest.get("/Noida");
		jsonPathEvaluator = response.jsonPath();

	}

	@Test(groups = "Get_MethodTest", priority = 1)
	public void verfiyBody() {
		Assert.assertTrue(response.getBody().asString().toLowerCase().contains("noida"),
				"body doesn't contains word noida----Body verification failed");
	}

	@Test(groups = "Get_MethodTest", priority = 2)
	public void verfiyStatusCode() {
		Assert.assertEquals(response.getStatusCode(), 200, "status code matched successfully---status line verified");

	}

	@Test(groups = "Get_MethodTest", priority = 3)
	public void printAllHeader() {
		Headers headers = response.getHeaders();
		for (Header header : headers) {
			System.out.println(header.getName() + " : " + header.getValue());
		}
	}

	@Test(groups = "Get_MethodTest", priority = 4)
	public void verifyHeader() {
		Assert.assertEquals(response.getHeader("Content-Type"), "application/json", "header value match nhi hui");

	}

	@Test(groups = "Get_MethodTest", priority = 5)
	public void verifyNode() {
		Assert.assertEquals(jsonPathEvaluator.get("City"), "Noida", "cityname does not match with the City node");

	}

	@Test(groups = "Get_MethodTest", priority = 6)
	public void getAllInfoInBody() {
		System.out.println(jsonPathEvaluator.get("Temperature").toString());
		System.out.println(jsonPathEvaluator.get("WeatherDescription").toString());
		System.out.println(response.getBody());

	}

	
	  @Test(groups = "post_weatherAPI", dependsOnGroups = "Get_MethodTest")
	  public void post_WeatherAPI() { System.out.println("post method start");
	  RestAssured.baseURI = "http://restapi.demoqa.com/customer";
	  httpsRequest = RestAssured.given();
	  
	  JSONObject requestparam = new JSONObject();
	  requestparam.put("FirstName","ankit");
	  requestparam.put("LastName", "sharma");
	  requestparam.put("UserName", "ankit6145"); 
	  requestparam.put("Password","India@1234"); 
	  requestparam.put("Email", "ankit@gmail.com");
	  
	  httpsRequest.header("Content-Type", "application/json");
	  httpsRequest.body(requestparam.toJSONString());
	  
	  postResponse = httpsRequest.post("/register");
	  
	  
	  
	  System.out.println(postResponse.getStatusLine());
	  System.out.println(postResponse.getBody().asString());
	  Assert.assertEquals(postResponse.getStatusCode(), 201);
	  
	  }
	 
}
