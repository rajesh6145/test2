package restAssuredPKG;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Get_SerializationAndDeserialization {
	
	@Test
	public void method() {
		RestAssured.baseURI= "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification getRequest=  RestAssured.given();
		Response response= getRequest.get("/noida");
		
		JsonPath nodes = response.jsonPath();
		System.out.println(nodes.get("Humidity").toString());
		
		System.out.println("************************");
		
		ResponseBody body= response.getBody();
		GetReqSuccessResponse obj =  body.as(GetReqSuccessResponse.class);
		System.out.println(obj.City);
		System.out.println(obj.Temperature);
		System.out.println(obj.Humidity);
		System.out.println(obj.WeatherDescription);
		System.out.println(obj.WindSpeed);
		System.out.println(obj.WindDirectionDegree);
		
		
		
		
		
		//System.out.println(obj.Humidity); 
		
		
		
		
		
	}

}
