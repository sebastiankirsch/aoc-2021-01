import java.util.*

class SlidingDepthIncreasalComputer(private val windowSize: Int = 3) {
    fun calculateDeptIncreasals(input: String): Int {
        val slidingWindow: Deque<Int> = ArrayDeque(windowSize)
        var previousWindowSize: Int? = null
        var numberOfIncreases = 0
        input.trim().lines().map { Integer.parseInt(it.trim()) }.forEach { nextInt: Int ->
            with(slidingWindow) {
                if (size == windowSize) {
                    pop()
                }
                add(nextInt)
            }
            val currentWindowSize = with(slidingWindow) {
                if (size == windowSize)  sum() else null
            }

            previousWindowSize?.let {
                if (it < currentWindowSize ?: 0) {
                    numberOfIncreases++
                }
            }
            previousWindowSize = currentWindowSize
        }
        return numberOfIncreases
    }
}