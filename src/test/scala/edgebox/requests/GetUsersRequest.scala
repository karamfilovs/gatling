package requests

import config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GetUsersRequest {
  val headers = Map("Authorization" -> "Bearer ${token}")

  val get_users = http("Get Users").get(app_url + "/authAdminApi/api/Users").headers(headers)
    .check(status is 200)


}
