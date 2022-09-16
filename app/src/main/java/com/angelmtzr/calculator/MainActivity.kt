package com.angelmtzr.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.angelmtzr.calculator.util.Calculator
import com.angelmtzr.calculator.util.Operand.*
import com.angelmtzr.calculator.util.Digit.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var calculator: Calculator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculator = Calculator(screen)

        btnClear.setOnClickListener { calculator.clearClicked() }
        btnToggleSign.setOnClickListener { calculator.toggleSignClicked() }
        btnPercentage.setOnClickListener { calculator.percentageClicked() }
        btnDivision.setOnClickListener { calculator.operandClicked(DIVISION) }

        btnSeven.setOnClickListener { calculator.numberClicked(SEVEN) }
        btnEight.setOnClickListener { calculator.numberClicked(EIGHT) }
        btnNine.setOnClickListener { calculator.numberClicked(NINE) }
        btnMult.setOnClickListener { calculator.operandClicked(MULTIPLICATION) }

        btnFour.setOnClickListener { calculator.numberClicked(FOUR) }
        btnFive.setOnClickListener { calculator.numberClicked(FIVE) }
        btnSix.setOnClickListener { calculator.numberClicked(SIX) }
        btnSubtraction.setOnClickListener { calculator.operandClicked(SUBTRACTION) }

        btnOne.setOnClickListener { calculator.numberClicked(ONE) }
        btnTwo.setOnClickListener { calculator.numberClicked(TWO) }
        btnThree.setOnClickListener { calculator.numberClicked(THREE) }
        btnAddition.setOnClickListener { calculator.operandClicked(ADDITION) }

        btnZero.setOnClickListener { calculator.numberClicked(ZERO) }
        btnDot.setOnClickListener { calculator.dotClicked() }
        btnEquals.setOnClickListener { calculator.equalsClicked() }

    }
}