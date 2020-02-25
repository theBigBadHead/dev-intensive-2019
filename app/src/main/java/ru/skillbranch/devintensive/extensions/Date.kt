package ru.skillbranch.devintensive.extensions

import java.text.SimpleDateFormat
import java.util.*

const val SECOND = 1000L
const val MINUTE = 60 * SECOND
const val HOUR = 60 * MINUTE
const val DAY = 24 * HOUR

fun Date.format(pattern: String = "HH:mm:ss dd.mm.yy"): String {
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format((this))
}

fun Date.add(value: Int, units: TimeUnit = TimeUnit.SECOND): Date {
    var time = this.time
    time += when (units) {
        TimeUnit.SECOND -> value * SECOND
        TimeUnit.MUNUTE -> value * MINUTE
        TimeUnit.HOUR -> value * HOUR
        TimeUnit.DAY -> value * DAY
    }
    this.time = time
    return this
}

enum class TimeUnit {
    SECOND,
    MUNUTE,
    HOUR,
    DAY
}

fun Date.humanizeDiff(date: Date = Date()): String {
    var dr = Date()

    return "lol"
}

fun Date.shortFormat(): String {
    val pattern = if (this.isSameDay((Date()))) "HH:mm" else "dd.MM.yy"
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}

private fun Date.isSameDay(date: Date): Boolean {
    val day1 = this.time / DAY
    val day2 = date.time / DAY
    return day1 == day2
}
