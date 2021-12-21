import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DepthIncreasalComputerTest {

    @Test
    fun steadyIncreasal() {
        val result = DepthIncreasalComputer.calculateDeptIncreasals(
            """
                1
                2
                3
                4
            """
        )

        assertSame(3, result)
    }

    @Test
    fun noIncreasal() {
        val result = DepthIncreasalComputer.calculateDeptIncreasals(
            """
                4
                3
                2
                1
            """
        )

        assertSame(0, result)
    }

    @Test
    fun noneTimeIncreasal() {
        val result = DepthIncreasalComputer.calculateDeptIncreasals(
            """
                1
                4
                4
                3
                2
            """
        )

        assertSame(1, result)
    }

}