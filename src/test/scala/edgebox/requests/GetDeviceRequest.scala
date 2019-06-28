package requests

import config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._


object GetDevicesRequest {
  val sentHeaders = Map("Authorization" -> "Bearer ${token}")

  val get_device = http("Get Device").get(app_url + "/portal/api/devices").headers(sentHeaders)
    .check(status is 200)

}
