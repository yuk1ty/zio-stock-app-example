package com.github.yuk1ty.modules

import com.github.yuk1ty.adapter.external.persistence.repository.stock.StockInfoRepository
import com.github.yuk1ty.app.usecase.stock.StockViewUseCase
import com.softwaremill.macwire.wire

trait UseCaseModules {
  lazy val stockViewUseCase: StockViewUseCase = wire[StockViewUseCase]

  def stockInfoRepository: StockInfoRepository
}
