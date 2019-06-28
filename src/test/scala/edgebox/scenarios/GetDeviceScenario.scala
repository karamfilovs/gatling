package scenarios

import requests.GetTokenRequest
import requests.GetDevicesRequest;
import io.gatling.core.Predef.scenario

object GetDeviceScenario {

  val getDeviceScenario = scenario("Get Device Scenario")
    .exec(GetTokenRequest.obtain_token)
    .exec(GetDevicesRequest.get_device)
}
