package com.github.yuk1ty.adapter.driver.http

import zhttp.*
import zhttp.http.*
import zio.ZIO
import zio.logging.{Logging, log}

val hc = Http.collectM[Request] {
  case Method.GET -> !! / "hc" => ZIO.succeed(Response.text("OK"))
}
