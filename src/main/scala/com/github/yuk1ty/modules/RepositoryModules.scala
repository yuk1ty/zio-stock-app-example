package com.github.yuk1ty.modules

import com.github.yuk1ty.adapter.external.persistence.repository.stock.StockInfoRepository
import com.softwaremill.macwire.wire

trait RepositoryModules {
  lazy val stockInfoRepository: StockInfoRepository = wire[StockInfoRepository]
}
