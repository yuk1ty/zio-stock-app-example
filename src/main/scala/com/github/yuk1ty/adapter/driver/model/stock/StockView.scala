package com.github.yuk1ty.adapter.driver.model.stock

import com.github.yuk1ty.kernel.model.stock.StockInfo.TickerSymbol
import io.circe.Encoder
import io.circe.Decoder
import io.circe.generic.semiauto.*

case class StockView(tickerSymbol: String, name: String)

object StockView {
  implicit val encoder: Encoder[StockView] = deriveEncoder
  implicit val decoder: Decoder[StockView] = deriveDecoder
}
