package com.github.yuk1ty
import com.github.yuk1ty.adapter.driver.http.HealthCheckRouter
import zhttp.service.Server
import zio.console.*
import zio.interop.catz.*
import zio.interop.catz.implicits.*
import zio.{ExitCode, Task, URIO, ZEnv, ZIO}

object Main extends zio.App {
  override def run(args: List[String]): URIO[ZEnv, ExitCode] =
    Server.start(9999, HealthCheckRouter.hc.silent).exitCode
}
