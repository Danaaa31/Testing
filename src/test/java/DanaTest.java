import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
public class DanaTest {
    @Test
    public void getUsers(){
        given()
                .baseUri("https://reqres.in/")
                .basePath("/api/users?delay=3")
                .contentType(ContentType.JSON)
                .when().get()
                .then().statusCode(200);
    }
}
