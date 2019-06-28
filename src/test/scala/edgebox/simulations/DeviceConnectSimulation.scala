package simulations

import io.gatling.core.Predef.{Simulation, atOnceUsers, scenario}
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef._
import scenarios.{GetDeviceScenario, GetUsersScenario}
import config.Config.users;

class DeviceConnectSimulation extends Simulation{

  private val createDeviceExec = GetDeviceScenario.getDeviceScenario
    .inject(atOnceUsers(users))

  private val getUserExec = GetUsersScenario.getUserScenario
    .inject(atOnceUsers(users))

  setUp(createDeviceExec, getUserExec)

}
