package br.com.relirk.imc.extensions

fun Double.format(digits: Int) = String.format("%.${digits}f", this)