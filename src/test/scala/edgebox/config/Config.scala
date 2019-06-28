package config


object Config {
   val app_url = "https://yoursite.io"

  val users = Integer.getInteger("users", 5).toInt
  val rampUp = Integer.getInteger("rampup", 1).toInt
  val throughput = Integer.getInteger("throughput", 100).toInt

}
