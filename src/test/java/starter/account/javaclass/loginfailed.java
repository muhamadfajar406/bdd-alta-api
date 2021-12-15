package starter.account.javaclass;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

public class loginfailed {

    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;

    @Step
    public void setBodyReqBlankPass() {
        requestParams = new JSONObject();
        requestParams.put("userName","muhamadfaj34r4502"+endpoint.huruf+endpoint.huruf2);
        requestParams.put("password","");
    }

    @Step
    public void hitEndPointLoginBlankPass() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.LOGIN)
                .then()
                .statusCode(400);


    }
}
