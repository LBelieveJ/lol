package com.kagome.osiwali_lol.test

import kotlinx.coroutines.*
import java.lang.Exception

class Test {
}

fun main(args: Array<String>) {

//    runBlocking {
//        try {
//            coroutineScope {
//                val deferred = async {
//                    throw Exception("throw exception in async block")
//                }
//
//                try {
//                    deferred.await()
//                } catch (e: Exception) {
//                    println(e)
//                }
//
//                println("end ?")
//                launch {
//                    try {
//                        throw Exception("throw exception in launch block")
//                    } catch (exception: Exception) {
//                        println(exception)
//                    }
//                }
//
//            }
//        } catch (e: Exception) {
//            println(e)
//        }
//    }
    val handler = CoroutineExceptionHandler { context, exception ->
        println("Caught $exception")
    }

    runBlocking {
        val scope = CoroutineScope(Job())
        scope.launch(handler) {
            throw Exception("Failed coroutine")

        }

        withContext(Dispatchers.IO) {}
//    runBlocking {
//
//        launch {
//            async {
//                try {
//                    throw Exception("1212")
//                } catch (exception: Exception) {
//                    println(exception)
//                }
//            }
//
//        }
//    }
    }
}