package com.example.setupapplication.corotuines


data class Bus(
    val busName: String,
    val busNumber: String,
    val busRoute: String
)


val standardRoutes = listOf<Bus>(
    Bus("HRTC", "HP 12 4356", "Shimla to Kalka"),
    Bus("HR", "HR 42 4359", "Rohtak to Jind"),
    Bus("CTU", "CH 01 4756", "Chandigarh to Kalka")
)
