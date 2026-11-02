package com.example.setupapplication.corotuines

import kotlinx.coroutines.delay
import kotlinx.serialization.internal.throwMissingFieldException
import kotlin.time.Duration.Companion.milliseconds

suspend fun fetchBusName(): List<String> {
    delay(3000.milliseconds)
    val busNames = standardRoutes.map(){ bus ->
        bus.busName
    }
    return busNames
}
