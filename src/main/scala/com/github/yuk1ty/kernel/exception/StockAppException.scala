package com.github.yuk1ty.kernel.exception

enum StockAppException extends Throwable {
  case GeneralException(e: Throwable) extends StockAppException
}
