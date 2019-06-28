package requests

import config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._


object GetTokenRequest {

  val obtain_token = http("Obtain Token Request")
    .post(app_url + "/auth/connect/token")
    .header("Content-Type", "multipart/form-data")
    .bodyPart(StringBodyPart("client_secret", "X")).asMultipartForm
    .bodyPart(StringBodyPart("client_id", "X")).asMultipartForm
    .bodyPart(StringBodyPart("username", "X")).asMultipartForm
    .bodyPart(StringBodyPart("password", "X")).asMultipartForm
    .bodyPart(StringBodyPart("grant_type", "password")).asMultipartForm
    .check(status is 200)
    .check(jsonPath("$..access_token").saveAs("token"))

}
