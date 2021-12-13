package com.github.yuk1ty.kernel.model.shared

opaque type Amount = Int

object Amount {
  def apply(value: Int): Amount = {
    require(value > 0)
    value
  }
}
