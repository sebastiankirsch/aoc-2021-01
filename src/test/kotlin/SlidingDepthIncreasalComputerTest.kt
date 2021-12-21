import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SlidingDepthIncreasalComputerTest {

    val objectUnderTest =  SlidingDepthIncreasalComputer(3)

    @Test
    fun recognizesIncreasal() {
        val result = objectUnderTest.calculateDeptIncreasals(
            """
            1
            1
            1
            2
            2
            2
        """.trimIndent()
        )

        assertSame(3, result)
    }

    @Test
    fun recognizesSteadiness() {
        val result = objectUnderTest.calculateDeptIncreasals(
            """
            1
            1
            1
            2
            1
            1
        """.trimIndent()
        )

        assertSame(1, result)
    }

    @Test
    fun recognizesDecrease() {
        val result = objectUnderTest.calculateDeptIncreasals(
            """
            2
            2
            2
            1
            1
            1
        """.trimIndent()
        )

        assertSame(0, result)
    }

    @Test
    fun example() {
        val result = objectUnderTest.calculateDeptIncreasals(
            """
            199   
            200    
            208  
            210
            200
            207
            240  
            269
            260
            263
        """.trimIndent()
        )

        assertSame(5, result)
    }

}