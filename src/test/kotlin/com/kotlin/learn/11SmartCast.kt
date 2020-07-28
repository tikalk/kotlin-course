package com.kotlin.learn

/* implement eval for both Num and Sum */
fun eval(expr: Expr): Int = TODO()

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
