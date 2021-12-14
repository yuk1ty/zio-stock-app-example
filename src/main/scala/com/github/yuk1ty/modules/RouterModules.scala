package com.github.yuk1ty.modules

import com.softwaremill.macwire.*
import com.github.yuk1ty.adapter.driver.http.stock.StockRouter
import com.github.yuk1ty.app.usecase.stock.StockViewUseCase

trait RouterModules {
  lazy val stockRouter: StockRouter = wire[StockRouter]

  def stockViewUseCase: StockViewUseCase
}
