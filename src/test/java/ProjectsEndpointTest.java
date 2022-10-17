import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class ProjectsEndpointTest extends TestBase {

    @Test
    public void shouldGetAllProjects() {
        RestAssured
                .given()
                    .spec(getRequestSpec())
                    .auth().oauth2("1/1203158800656427:77f1a83806af31d8bd3c4397740a0cad")
                .when()
                    .get("https://app.asana.com/api/1.0/projects")
                .then().
                    statusCode(200)
                    .spec(getResponseSpec());


    }
}
