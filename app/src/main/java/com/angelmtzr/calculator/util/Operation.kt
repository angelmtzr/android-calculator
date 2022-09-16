package com.angelmtzr.calculator.util

class Operation(var first: Double,
                var second: Double,
                var operand: Operand) {

    fun getResult(): Double {
        return operand.operate(first, second)
    }
}
