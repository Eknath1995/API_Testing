import java.io.FileInputStream;

import io.restassured.RestAssured;

public class create_user_usingJsonfile {
	public static void main(String[] args) {
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\data.json");
		
	//	step 2
		restassured.given();
	}
}
