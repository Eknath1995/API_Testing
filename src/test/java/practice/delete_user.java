package practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class delete_user {
	public static void main(String[] args) {
		//step 1: Create the required data - POST, PUT, PATCH
		
		//step 2: send the requist
		Response resp = RestAssured.delete("https://reqres.in/api/user/2");
		
		//step 3: validate the responde
		resp.then().log().all();
	}
}
