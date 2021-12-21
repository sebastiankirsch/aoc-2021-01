fun main() {
    val input = getResourceAsText("/input.txt")

    val increases = DepthIncreasalComputer.calculateDeptIncreasals(input)
    println("Overall increases: $increases")

    val slidingWindowIncreases = SlidingDepthIncreasalComputer(3).calculateDeptIncreasals(input)
    println("Sliding window increases: $slidingWindowIncreases")
}

fun getResourceAsText(path: String): String {
    return object {}.javaClass.getResource(path).readText()
}