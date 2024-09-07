import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SampleTest{

    private val calculatorTest : Calculator = Calculator()
    private val postalCode : PostalCode = PostalCode()

    @Test
    fun testSum(){
        val expected = 42
        assertEquals(expected,calculatorTest.add(40,2))
    }


    @Test
    fun testPostalCode(){
        val code = "3113154869"
        val isValidPostalCode = postalCode.isValidPostalCode(code)
        assertEquals(true,isValidPostalCode)
    }

}