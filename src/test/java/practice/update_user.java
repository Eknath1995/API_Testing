package practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class update_user {
	public static void main(String[] args) {
	//step 1: Create the required data - POST, PUT, PATCH
		
		JSONObject jobj= new JSONObject();
		jobj.put("name", "Eknath");
		jobj.put("job", "lead");
		
	//step 2: send the requist
		
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		
		Response resp = req.post("https://reqres.in/api/user/2");
		
	//step 2: send the requist
		
		resp.then().log().all();
	}
}
