package com.angelmtzr.calculator.util

enum class Operand: IOperand {
    ADDITION {
        override fun toString() = "+"
        override fun operate(a: Double, b: Double) = a + b
    },
    SUBTRACTION {
        override fun toString() = "-"
        override fun operate(a: Double, b: Double) = a - b
    },
    MULTIPLICATION {
        override fun toString() = "×"
        override fun operate(a: Double, b: Double) = a * b
    },
    DIVISION {
        override fun toString() = "÷"
        override fun operate(a: Double, b: Double) = a / b
    },
    NONE {
        override fun toString() = ""
        override fun operate(a: Double, b: Double) = 0.0
    }
}