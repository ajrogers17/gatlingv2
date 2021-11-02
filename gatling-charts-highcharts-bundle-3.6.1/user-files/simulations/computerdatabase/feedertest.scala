package computerdatabase

import scala.concurrent.duration._

import _root_.java.io._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
//import java.io.ObjectInputFilter.Config

class PGRegistrationBooster extends Simulation {

  val httpProtocol = http
    .baseUrl("https://walgreensuat.curapatient.com")
 /*   .proxy(
      Proxy("127.0.0.1", 8000)
        .httpsPort(8000)
    )
    */.inferHtmlResources()

    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.81 Safari/537.36")

  var emails = "em"
  var url = "url"
  var path = "path"
  val headers_0 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "sec-ch-ua" -> """Google Chrome";v="95", "Chromium";v="95", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "macOS",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "none",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1")

  val csvfeeder = csv("/Users/alexrogers/Desktop/gatling-charts-highcharts-bundle-3.6.1/user-files/resources/computerdatabase/pgregistrationbooster/B2BAssessmentLoop.csv").circular

  val scn = scenario("FeederTest")

    .exec(http("request_0")
      .get("https://gatling.io/docs/gatling/reference/current/session/feeder/")
      .headers(headers_0))
    .feed(csvfeeder)
    .exec(session => {
    println("beginning session one")
      emails = session("emails").as[String]
      println(session)
      println("""${emails}""")
      println(emails)
      session
    })
    //.feed(csvfeeder)
    .exec(session => {
      println("beginning session two")
      println("""${emails}""")
      session
    })
    .exec(session => {
      //session.set(emails, session("emails").as[String])
      //emails = session("emails").as[String] //ASSIGN VALUES
      session.set(url, "url")
      session.set(path, "path")
      session
    })
    .exec(session => {
      println("beginning session 3")
      println(emails)
      session
    })

  setUp(scn.inject(atOnceUsers(1)).protocols(httpProtocol))

}