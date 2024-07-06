import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BookStoreApiTest {

    @Test
    public void testGetBooks() {
        RestAssured.baseURI = "https://demoqa.com/swagger";

        given().
                when().
                get("/books").
                then().
                statusCode(200).
                body("books", not(empty()));
    }

    @Test
    public void testGetBookById() {
        RestAssured.baseURI = "https://demoqa.com/swagger";

        given().
                pathParam("id", 1).
                when().
                get("/books/{id}").
                then().
                statusCode(200).
                body("id", equalTo(1));
    }
}
