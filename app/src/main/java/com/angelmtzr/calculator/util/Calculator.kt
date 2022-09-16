package com.angelmtzr.calculator.util

import android.widget.TextView
import com.angelmtzr.calculator.util.Operand.*

class Calculator(private val screen: TextView) {

    private var operation: Operation = Operation(0.0, 0.0, NONE)
    private var justPressedOperator: Boolean = false
    private var justPressedEqual: Boolean = false

    private fun trimTrailingZeros() {
        val intAndDecimal = screen.text.toString().split(".")
        if (intAndDecimal[1].toDouble() == 0.0)
            screen.text = intAndDecimal[0]
    }

    fun clearClicked() {
        screen.text = "0"
        operation = Operation(0.0, 0.0, NONE)
    }

    fun toggleSignClicked() {
        val screenNum = screen.text.toString()
        screen.text =
            if (screenNum.toDouble() == 0.0) "0"
            else (screenNum.toDouble() * -1).toString()
        trimTrailingZeros()
    }

    fun percentageClicked() {
        val screenNum = screen.text.toString()
        screen.text = if (screenNum.toDouble() == 0.0) "0"
        else (screenNum.toDouble() / 100).toString()
        trimTrailingZeros()
    }

    fun operandClicked(clickedOperand: Operand) {
        operation.operand = clickedOperand
        justPressedOperator = true
    }

    fun numberClicked(clickedNum: Digit) {
        if (justPressedOperator) {
            operation.first = screen.text.toString().toDouble()
            screen.text = clickedNum.toString()
            justPressedOperator = false
            return
        }
        if (justPressedEqual) {
            screen.text = clickedNum.toString()
            justPressedEqual = false
            return
        }
        screen.text =
            if (screen.text.toString() == "0") clickedNum.toString()
            else screen.text.toString() + clickedNum.toString()
    }

    fun dotClicked() {
        val screenNum = screen.text.toString()
        if (screenNum.contains(".")) return
        val newText = "$screenNum."
        screen.text = newText
    }

    fun equalsClicked() {
        operation.second = screen.text.toString().toDouble()
        screen.text = operation.getResult().toString()
        trimTrailingZeros()
        justPressedEqual = true
    }
}