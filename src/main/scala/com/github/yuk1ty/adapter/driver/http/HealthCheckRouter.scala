package com.github.yuk1ty.adapter.driver.http

import zhttp.*
import zhttp.http._

object HealthCheckRouter {
  val hc: Http[Any, Nothing, Request, UResponse] = Http.collect[Request] {
    case Method.GET -> !! / "hc" => Response.text("OK")
  }
}
