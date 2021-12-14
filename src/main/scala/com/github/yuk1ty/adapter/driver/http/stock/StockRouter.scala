package com.github.yuk1ty.adapter.driver.http.stock

import com.github.yuk1ty.adapter.driver.model.stock.StockView
import com.github.yuk1ty.app.usecase.stock.StockViewUseCase
import com.github.yuk1ty.kernel.exception.StockAppException
import zhttp.*
import zhttp.http.*
import io.circe.syntax.*

class StockRouter(stockViewUseCase: StockViewUseCase) {

  val routing = showAllStock

  private val showAllStock: Http[Any, StockAppException, Request, UResponse] =
    Http.collectM[Request] {
      case Method.GET -> !! / "stocks" =>
        stockViewUseCase.showAllStocks().map { stocks =>
          Response.jsonString(
            stocks.map(s => StockView(s.tickerSymbol.toString, s.name)).asJson.toString)
        }
    }
}
