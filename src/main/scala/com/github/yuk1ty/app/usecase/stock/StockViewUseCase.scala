package com.github.yuk1ty.app.usecase.stock

import com.github.yuk1ty.adapter.external.persistence.repository.stock.StockInfoRepository
import com.github.yuk1ty.kernel.exception.StockAppException
import com.github.yuk1ty.kernel.model.stock.StockInfo
import zio.IO

class StockViewUseCase(stockInfoRepository: StockInfoRepository) {
  def showAllStocks(): IO[StockAppException, Vector[StockInfo]] = ???
}
