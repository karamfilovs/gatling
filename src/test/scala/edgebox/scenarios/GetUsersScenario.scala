package scenarios

import io.gatling.core.Predef.scenario
import requests.{GetTokenRequest, GetUsersRequest}

object GetUsersScenario {
  val getUserScenario = scenario("Get User Scenario")
    .exec(GetTokenRequest.obtain_token)
    .exec(GetUsersRequest.get_users)

}
