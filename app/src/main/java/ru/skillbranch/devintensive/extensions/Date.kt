package ru.skillbranch.devintensive.extensions

import android.text.format.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import kotlin.time.minutes

const val SECOND = 1000L
const val MINUTE = 60 * SECOND
const val HOUR = 60 * MINUTE
const val DAY = 24 * HOUR

fun Date.format(pattern:String="HH:mm:ss dd.mm.yy"):String{
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format((this))
}

fun Date.add(value: Int, units: TimeUnits = TimeUnits.SECOND): Date {
    var time = this.time
    time += when (units) {
        TimeUnits.SECOND -> value * SECOND
        TimeUnits.MUNUTE -> value * MINUTE
        TimeUnits.HOUR -> value * HOUR
        TimeUnits.DAY -> value * DAY
    }
    this.time = time
    return this
}
enum class TimeUnits{
    SECOND,
    MUNUTE,
    HOUR,
    DAY
}

fun Date.humanizeDiff(date:Date = Date()): String{
    var dr = Date()

    return "lol"
    }
