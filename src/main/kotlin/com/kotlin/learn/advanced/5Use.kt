package com.kotlin.learn.advanced

import java.io.File

/*
 Use function is an inline function used to execute given block function on this resource,
 It closes the resource correctly once after the operation is completed
*/
fun main() {
    val file = File("input"+File.separator+"contents.txt")
    file.bufferedReader().use{
        println(it.readText())
    }
}
