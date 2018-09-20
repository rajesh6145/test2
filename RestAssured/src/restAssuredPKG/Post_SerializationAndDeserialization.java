package restAssuredPKG;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Post_SerializationAndDeserialization {

	@Test
	public void method() {

		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		RequestSpecification request = RestAssured.given();

		JSONObject reqParam = new JSONObject();
		reqParam.put("FirstName", "abhi123");
		reqParam.put("LastName", "verma123");
		reqParam.put("UserName", "6145");
		reqParam.put("Password", "44i@123");
		reqParam.put("Email", "ahi@gmail.com");

		request.body(reqParam.toJSONString());
		// request.header("Content-Type", "application/json");
		Response response = request.post("/register");

		JsonPath jsonPathEvaluator = response.jsonPath();
		ResponseBody body = response.getBody();
		// System.out.println(response.body().asString()+" "+response.getStatusCode());

		if (response.getStatusCode() == 201) {
			RegistrationReqSuccessReponse registrationReqSuccessReponse = body.as(RegistrationReqSuccessReponse.class);

			Assert.assertEquals(registrationReqSuccessReponse.Message, "Operation completed successfully",
					"message match nhi hua bhai");
			Assert.assertEquals(registrationReqSuccessReponse.SuccessCode, "OPERATION_SUCCESS",
					"success code match nhi hua");
		}

		if (response.getStatusCode() != 201) {
			RegistrationReqFailureResponse registrationReqFailureResponse = body
					.as(RegistrationReqFailureResponse.class);

			Assert.assertEquals(registrationReqFailureResponse.FaultId, "User already exists",
					"faultID match nhi hui bhai");
			Assert.assertEquals(registrationReqFailureResponse.fault, "FAULT_USER_ALREADY_EXISTS",
					"fault value match nhi hui");

		}

	}

}
