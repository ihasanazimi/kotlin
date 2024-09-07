import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SampleTest{

    private val calculatorTest : Calculator = Calculator()

    @Test
    fun testSum(){
        val expected = 42
        assertEquals(expected,calculatorTest.add(40,2))
    }

}