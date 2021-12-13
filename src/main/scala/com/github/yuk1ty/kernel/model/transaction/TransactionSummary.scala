package com.github.yuk1ty.kernel.model.transaction

import java.time.LocalDateTime

case class TransactionSummary(
    asOf: LocalDateTime,
    transactions: Vector[Transaction]
)
