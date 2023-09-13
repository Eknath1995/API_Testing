package practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class patch_user {
	public static void main(String[] args) {

			

			RequestSpecification req = RestAssured.given("https://reqres.in/api/user/2");
			
			
//			Response resp = req.patch("https://reqres.in/api/user/2");
			

			resp.then().log().all();
	}
}
