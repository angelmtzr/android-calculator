package com.angelmtzr.calculator.util

enum class Digit {
    ZERO {
        override fun toString(): String {
            return "0"
        }
    },
    ONE {
        override fun toString(): String {
            return "1"
        }
    },
    TWO {
        override fun toString(): String {
            return "2"
        }
    },
    THREE {
        override fun toString(): String {
            return "3"
        }
    },
    FOUR {
        override fun toString(): String {
            return "4"
        }
    },
    FIVE {
        override fun toString(): String {
            return "5"
        }
    },
    SIX {
        override fun toString(): String {
            return "6"
        }
    },
    SEVEN {
        override fun toString(): String {
            return "7"
        }
    },
    EIGHT {
        override fun toString(): String {
            return "8"
        }
    },
    NINE {
        override fun toString(): String {
            return "9"
        }
    }
}