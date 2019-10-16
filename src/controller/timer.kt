package controller

import java.util.*

class timer {
    inline fun timer(
        name: String? = null,
        daemon: Boolean = false,
        initialDelay: Long = 0.toLong(),
        period: Long,
        crossinline action: TimerTask.() -> Unit
    ) {
    }
}