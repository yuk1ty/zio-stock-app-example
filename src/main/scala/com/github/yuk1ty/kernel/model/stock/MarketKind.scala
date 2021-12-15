package com.github.yuk1ty.kernel.model.stock

enum MarketKind {
  case TSE, OSE
}

object MarketKind {
  extension (k: MarketKind) {
    def ident: String = k match {
      case MarketKind.TSE => "TSE"
      case MarketKind.OSE => "OSE"
    }
  }
}
