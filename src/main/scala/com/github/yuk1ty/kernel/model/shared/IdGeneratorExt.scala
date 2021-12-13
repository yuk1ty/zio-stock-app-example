package com.github.yuk1ty.kernel.model.shared

import java.util.UUID

transparent trait IdGeneratorExt {
  def gen(): String = UUID.randomUUID.toString
}
