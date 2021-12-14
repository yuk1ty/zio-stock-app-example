package com.github.yuk1ty
import com.github.yuk1ty.adapter.driver.http.hc
import com.github.yuk1ty.modules.{RepositoryModules, RouterModules, UseCaseModules}
import zhttp.service.Server
import zio.console.*
import zio.interop.catz.*
import zio.interop.catz.implicits.*
import zio.logging.{LogFormat, LogLevel, Logger, Logging}
import zio.{ExitCode, Task, URIO, ZEnv, ZIO}

object Main extends zio.App with RepositoryModules with UseCaseModules with RouterModules {

  override def run(args: List[String]) =
    Server.start(9999, hc ++ stockRouter.routing).exitCode
}
