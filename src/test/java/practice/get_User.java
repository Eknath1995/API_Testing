package practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class get_User {
		public static void main(String[] args) {
			
			//step 1: Create the required data - POST, PUT, PATCH
				
			//step 2: send the requist
				Response resp = RestAssured.get("https://reqres.in/api/user/2");
					
					
					
			//step 3: validate the responde
					resp.then().log().all(); // print the response in json format in consol
			
		}
}
