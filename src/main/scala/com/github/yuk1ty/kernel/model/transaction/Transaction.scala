package com.github.yuk1ty.kernel.model.transaction

import com.github.yuk1ty.kernel.model.stock.StockInfo.*
import com.github.yuk1ty.kernel.model.transaction.Transaction.*
import com.github.yuk1ty.kernel.model.shared.IdGeneratorExt
import java.time.LocalDateTime
import com.github.yuk1ty.kernel.model.shared.Amount

enum Transaction {
  case Sell(
      id: TransactionId,
      price: BigDecimal,
      marketPrice: BigDecimal,
      amount: Amount,
      stockInfoId: StockInfoId,
      executionDateTime: LocalDateTime
  )
  case Buy(
      id: TransactionId,
      price: BigDecimal,
      marketPrice: BigDecimal,
      amount: Amount,
      stockInfoId: StockInfoId,
      executionDateTime: LocalDateTime
  )
}

object Transaction {
  opaque type TransactionId = String

  object TransactionId extends IdGeneratorExt {
    def apply(): TransactionId = gen()
  }
}
