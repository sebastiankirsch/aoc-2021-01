object DepthIncreasalComputer {
    fun calculateDeptIncreasals(input: String): Int {
        var previous: Int? = null
        var numberOfIncreases = 0
        input.trim().lines().map { Integer.parseInt(it.trim()) }.forEach { nextInt: Int ->
            previous?.let {
                if (it < nextInt) {
                    numberOfIncreases++
                }
            }
            previous = nextInt
        }
        return numberOfIncreases
    }
}