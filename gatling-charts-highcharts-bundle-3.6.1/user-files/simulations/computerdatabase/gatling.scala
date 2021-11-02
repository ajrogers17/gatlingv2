package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class gatling extends Simulation {

	val httpProtocol = http
		.baseUrl("https://gatling.io")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.54 Safari/537.36")

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

	val headers_1 = Map(
		"sec-ch-ua" -> """Google Chrome";v="95", "Chromium";v="95", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "macOS")

	val headers_2 = Map(
		"Origin" -> "https://gatling.io",
		"sec-ch-ua" -> """Google Chrome";v="95", "Chromium";v="95", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "macOS")

	val headers_13 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Google Chrome";v="95", "Chromium";v="95", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "macOS",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_17 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "text/plain",
		"origin" -> "https://gatling.io",
		"sec-ch-ua" -> """Google Chrome";v="95", "Chromium";v="95", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "macOS",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_18 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Google Chrome";v="95", "Chromium";v="95", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "macOS",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin")

	val headers_21 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "text/plain;charset=UTF-8",
		"origin" -> "https://gatling.io",
		"sec-ch-ua" -> """Google Chrome";v="95", "Chromium";v="95", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "macOS",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_23 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"If-Modified-Since" -> "Wed, 29 Sep 2021 19:17:49 GMT",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site",
		"sec-ch-ua" -> """Google Chrome";v="95", "Chromium";v="95", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "macOS")

	val headers_25 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "text/plain",
		"origin" -> "https://gatling.io",
		"sec-ch-ua" -> """Google Chrome";v="95", "Chromium";v="95", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "macOS",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site",
		"x-client-data" -> "CI+2yQEIorbJAQjEtskBCKmdygEI7/LLAQie+csBCOaEzAEI+oTMAQi1hcwBCIaIzAEIy4nMAQ==")

	val headers_26 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Google Chrome";v="95", "Chromium";v="95", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "macOS",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"x-client-data" -> "CI+2yQEIorbJAQjEtskBCKmdygEI7/LLAQie+csBCOaEzAEI+oTMAQi1hcwBCIaIzAEIy4nMAQ==")

	val headers_28 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Google Chrome";v="95", "Chromium";v="95", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "macOS",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"x-client-data" -> "CI+2yQEIorbJAQjEtskBCKmdygEI7/LLAQie+csBCOaEzAEI+oTMAQi1hcwBCIaIzAEIy4nMAQ==")

	val headers_33 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Google Chrome";v="95", "Chromium";v="95", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "macOS",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_36 = Map(
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Google Chrome";v="95", "Chromium";v="95", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "macOS")

	val headers_40 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://gatling.io",
		"sec-ch-ua" -> """Google Chrome";v="95", "Chromium";v="95", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "macOS",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

    val uri01 = "https://connect.facebook.net"
    val uri02 = "https://www.google-analytics.com"
    val uri03 = "https://www.facebook.com/tr"
    val uri05 = "https://analytics.twitter.com/i/adsct"
    val uri06 = "https://vars.hotjar.com/box-d09a446edefba0dcce5d5143e1840e9a.html"
    val uri07 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/956135235"
    val uri08 = "https://www.googletagmanager.com"
    val uri09 = "https://t.co/i/adsct"
    val uri10 = "https://www.google.com"
    val uri11 = "https://px.ads.linkedin.com/collect"
    val uri12 = "https://vc.hotjar.io/sessions/1208676"
    val uri13 = "https://static.ads-twitter.com/uwt.js"
    val uri14 = "https://script.hotjar.com/modules.d4630e91cffbd6b56a37.js"
    val uri15 = "https://www.googleadservices.com/pagead/conversion_async.js"
    val uri16 = "https://fonts.googleapis.com/css2"
    val uri17 = "https://stats.g.doubleclick.net/j/collect"
    val uri18 = "https://snap.licdn.com/li.lms-analytics/insight.min.js"
    val uri19 = "https://static.hotjar.com/c/hotjar-1208676.js"
    val uri20 = "https://fonts.gstatic.com/s/dmsans/v6"

	val scn = scenario("gatling")
		.exec(http("request_0")
			.get("/docs/gatling/reference/current/session/feeder/")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri16 + "?family=DM+Sans:ital,wght@0,400;0,500;0,700;1,400;1,500;1,700&display=swap")
			.headers(headers_1),
            http("request_2")
			.get("/docs/main.c140ba52ef69f5424b8b8c12f3173f6fdfcac12dfea66b9c4db9456047295a47b6ff2e528eeab87975ac00ca78f45a7d775c5a45a58675df5c5ec54ac74bd5c5.css")
			.headers(headers_2),
            http("request_3")
			.get("/docs/images/logo-gatling-noir.svg")
			.headers(headers_1),
            http("request_4")
			.get("/docs/images/logo-gatling.svg")
			.headers(headers_1),
            http("request_5")
			.get("/docs/index.js")
			.headers(headers_2),
            http("request_6")
			.get("/docs/js/jquery.min.e1fcfd6f73099aa1be584a62b12290a21858b160705b787269ea79c6b9035add1a447ef74aa66f8172d5189a922e4b6a68f2f6711ba067f2a4de6c2d26bbc971.js")
			.headers(headers_2),
            http("request_7")
			.get("/docs/main.min.675b6b7e6bfa0239b2218b233e51e5ff80bd43e13d0dcec2f1abf709ac9091a7182ed0b830e5eb240af17e4d781620ad30acfd058af12934d3eae0b8534f76e9.js")
			.headers(headers_2),
            http("request_8")
			.get("/docs/images/alerts/lightbulb-regular.svg")
			.headers(headers_1),
            http("request_9")
			.get("/docs/images/alerts/exclamation-solid.svg")
			.headers(headers_1),
            http("request_10")
			.get(uri20 + "/rP2Hp2ywxg089UriCZOIHTWEBlw.woff2")
			.headers(headers_2),
            http("request_11")
			.get(uri20 + "/rP2Cp2ywxg089UriASitCBimC3YU-Ck.woff2")
			.headers(headers_2),
            http("request_12")
			.get(uri20 + "/rP2Fp2ywxg089UriCZa4Hz-DJF4e8A.woff2")
			.headers(headers_2),
            http("request_13")
			.get(uri08 + "/gtag/js?id=UA-53375088-1")
			.headers(headers_13),
            http("request_14")
			.get(uri08 + "/gtm.js?id=GTM-MJX8KRG")
			.headers(headers_13),
            http("request_15")
			.get(uri02 + "/analytics.js")
			.headers(headers_13),
            http("request_16")
			.get(uri08 + "/gtag/js?id=G-B5J9F14X56&l=dataLayer&cx=c")
			.headers(headers_13),
            http("request_17")
			.post(uri02 + "/j/collect?v=1&_v=j93&a=269171420&t=pageview&_s=1&dl=https%3A%2F%2Fgatling.io%2Fdocs%2Fgatling%2Freference%2Fcurrent%2Fsession%2Ffeeder%2F&ul=en-us&de=UTF-8&dt=Gatling%20-%20Feeders&sd=30-bit&sr=1792x1120&vp=1224x1009&je=0&_u=QACAAUADQAAAAC~&jid=1222722018&gjid=1300611114&cid=1967973024.1634601661&tid=UA-53375088-1&_gid=1449761776.1635292358&_r=1&gtm=2ouar0&z=1289324757")
			.headers(headers_17),
            http("request_18")
			.get("/docs/search/index.json")
			.headers(headers_18),
            http("request_19")
			.get(uri01 + "/en_US/fbevents.js")
			.headers(headers_13),
            http("request_20")
			.get(uri02 + "/gtm/js?id=OPT-56TCH3T&t=gtm8&cid=1967973024.1634601661")
			.headers(headers_13),
            http("request_21")
			.post(uri02 + "/g/collect?v=2&tid=G-B5J9F14X56&gtm=2oear0&_p=269171420&sr=1792x1120&ul=en-us&cid=1967973024.1634601661&_s=1&dl=https%3A%2F%2Fgatling.io%2Fdocs%2Fgatling%2Freference%2Fcurrent%2Fsession%2Ffeeder%2F&dt=Gatling%20-%20Feeders&sid=1635439422&sct=9&seg=0&en=page_view&_ss=1")
			.headers(headers_21),
            http("request_22")
			.get(uri13)
			.headers(headers_13),
            http("request_23")
			.get(uri18)
			.headers(headers_23),
            http("request_24")
			.post(uri02 + "/j/collect?v=1&_v=j93&a=269171420&t=pageview&_s=1&dl=https%3A%2F%2Fgatling.io%2Fdocs%2Fgatling%2Freference%2Fcurrent%2Fsession%2Ffeeder%2F&ul=en-us&de=UTF-8&dt=Gatling%20-%20Feeders&sd=30-bit&sr=1792x1120&vp=1224x1009&je=0&_u=SCCAAUADQAAAAC~&jid=937600090&gjid=283394481&cid=1967973024.1634601661&tid=UA-53375088-1&_gid=1449761776.1635292358&_r=1&gtm=2wgar0MJX8KRG&z=1517089330")
			.headers(headers_17),
            http("request_25")
			.post(uri17 + "?t=dc&aip=1&_r=3&v=1&_v=j93&tid=UA-53375088-1&cid=1967973024.1634601661&jid=937600090&gjid=283394481&_gid=1449761776.1635292358&_u=SCCAAUADQAAAAC~&z=1446491362")
			.headers(headers_25),
            http("request_26")
			.get(uri15)
			.headers(headers_26),
            http("request_27")
			.post(uri17 + "?t=dc&aip=1&_r=3&v=1&_v=j93&tid=UA-53375088-1&cid=1967973024.1634601661&jid=1222722018&gjid=1300611114&_gid=1449761776.1635292358&_u=QACAAUACQAAAAC~&z=610139202")
			.headers(headers_25),
            http("request_28")
			.get(uri10 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j93&tid=UA-53375088-1&cid=1967973024.1634601661&jid=1222722018&_u=QACAAUACQAAAAC~&z=1894702130")
			.headers(headers_28),
            http("request_29")
			.get(uri10 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j93&tid=UA-53375088-1&cid=1967973024.1634601661&jid=937600090&_u=SCCAAUADQAAAAC~&z=1813600085")
			.headers(headers_28),
            http("request_30")
			.get(uri05 + "?type=javascript&version=2.0.4&p_id=Twitter&p_user_id=0&txn_id=o4d3i&events=%5B%5B%22pageview%22%2Cnull%5D%5D&tw_sale_amount=0&tw_order_quantity=0&tw_iframe_status=0&event_id=ed490cae-4c6c-446d-96c6-b5cd26401d4d&tw_document_href=https%3A%2F%2Fgatling.io%2Fdocs%2Fgatling%2Freference%2Fcurrent%2Fsession%2Ffeeder%2F&tpx_cb=twttr.conversion.loadPixels")
			.headers(headers_13),
            http("request_31")
			.get(uri19 + "?sv=7")
			.headers(headers_13),
            http("request_32")
			.get(uri07 + "/?random=1635439423225&cv=9&fst=1635439423225&num=1&guid=ON&resp=GooglemKTybQhCsO&u_h=1120&u_w=1792&u_ah=1120&u_aw=1792&u_cd=30&u_his=2&u_tz=-420&u_java=false&u_nplug=5&u_nmime=2&gtm=2wgar0&sendb=1&ig=1&frm=0&url=https%3A%2F%2Fgatling.io%2Fdocs%2Fgatling%2Freference%2Fcurrent%2Fsession%2Ffeeder%2F&tiba=Gatling%20-%20Feeders&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
			.headers(headers_26),
            http("request_33")
			.get(uri09 + "?type=javascript&version=2.0.4&p_id=Twitter&p_user_id=0&txn_id=o4d3i&events=%5B%5B%22pageview%22%2Cnull%5D%5D&tw_sale_amount=0&tw_order_quantity=0&tw_iframe_status=0&event_id=ed490cae-4c6c-446d-96c6-b5cd26401d4d&tw_document_href=https%3A%2F%2Fgatling.io%2Fdocs%2Fgatling%2Freference%2Fcurrent%2Fsession%2Ffeeder%2F")
			.headers(headers_33),
            http("request_34")
			.get(uri01 + "/signals/config/669928753629967?v=2.9.47&r=stable")
			.headers(headers_13),
            http("request_35")
			.get(uri10 + "/pagead/1p-user-list/956135235/?random=1635439423225&cv=9&fst=1635436800000&num=1&guid=ON&u_h=1120&u_w=1792&u_ah=1120&u_aw=1792&u_cd=30&u_his=2&u_tz=-420&u_java=false&u_nplug=5&u_nmime=2&gtm=2wgar0&sendb=1&frm=0&url=https%3A%2F%2Fgatling.io%2Fdocs%2Fgatling%2Freference%2Fcurrent%2Fsession%2Ffeeder%2F&tiba=Gatling%20-%20Feeders&async=1&fmt=3&is_vtc=1&random=2893197583&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
			.headers(headers_28),
            http("request_36")
			.get(uri06)
			.headers(headers_36),
            http("request_37")
			.get(uri14)
			.headers(headers_13),
            http("request_38")
			.get(uri03 + "/?id=669928753629967&ev=PageView&dl=https%3A%2F%2Fgatling.io%2Fdocs%2Fgatling%2Freference%2Fcurrent%2Fsession%2Ffeeder%2F&rl=&if=false&ts=1635439423357&sw=1792&sh=1120&v=2.9.47&r=stable&ec=0&o=30&fbp=fb.1.1634601661395.1610194877&it=1635439423089&coo=false&rqm=GET")
			.headers(headers_33),
            http("request_39")
			.get(uri11 + "?v=2&fmt=js&pid=644497&time=1635439423157&url=https%3A%2F%2Fgatling.io%2Fdocs%2Fgatling%2Freference%2Fcurrent%2Fsession%2Ffeeder%2F")
			.headers(headers_33),
            http("request_40")
			.get(uri12 + "?s=0.25&r=0.0562881696797386")
			.headers(headers_40)))
		.pause(4)
		.exec(http("request_41")
			.post(uri02 + "/g/collect?v=2&tid=G-B5J9F14X56&gtm=2oear0&_p=269171420&sr=1792x1120&ul=en-us&cid=1967973024.1634601661&_s=2&dl=https%3A%2F%2Fgatling.io%2Fdocs%2Fgatling%2Freference%2Fcurrent%2Fsession%2Ffeeder%2F&dt=Gatling%20-%20Feeders&sid=1635439422&sct=9&seg=0&en=optimize.callback&_et=379&ep.callback=function(e%2Ct%2Cn)%7Bhj.log.debug(%22Experiment%20with%20ID%3A%20%22.concat(t%2C%22%20is%20on%20variant%3A%20%22).concat(e)%2C%22integrations.google_optimize%22)%2Chj.event.signal(%22exp.go%22%2C%7BexperimentId%3At%2CvariantId%3Ae%2CcontainerId%3An%7D)%7D")
			.headers(headers_21))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}