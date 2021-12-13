package com.github.yuk1ty.kernel.model.stock

import com.github.yuk1ty.kernel.model.shared.IdGeneratorExt

import java.util.UUID

case class StockInfo(
    id: StockInfo.StockInfoId,
    tickerSymbol: StockInfo.TickerSymbol,
    name: String
)

object StockInfo {
  opaque type StockInfoId = String
  opaque type TickerSymbol = String

  object StockInfoId extends IdGeneratorExt {
    def apply(): StockInfoId = gen()
  }
}
