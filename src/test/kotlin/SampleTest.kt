import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class SampleTest{

    class CalculatorTest{
        @Test
        fun testSum(){
            val expected = 42
            assertEquals(expected,Calculator().add(40,2))
        }
    }


    class PostalCodeValidatorTest {

        private val validator = ::isValidPostalCode

        @Test
        fun `valid postal code returns true`() {
            // A valid postal code
            val validPostalCode = "1234567891"
            assertTrue(validator(validPostalCode))
        }

        @Test
        fun `postal code with incorrect length returns false`() {
            // Postal code with less than 10 characters
            val shortPostalCode = "12345"
            assertFalse(validator(shortPostalCode))

            // Postal code with more than 10 characters
            val longPostalCode = "123456789123"
            assertFalse(validator(longPostalCode))
        }

        @Test
        fun `postal code with 0 or 2 in first five digits returns false`() {
            // Postal code with '0' in the first five digits
            val postalCodeWithZero = "0234567891"
            assertFalse(validator(postalCodeWithZero))

            // Postal code with '2' in the first five digits
            val postalCodeWithTwo = "2234567891"
            assertFalse(validator(postalCodeWithTwo))
        }

        @Test
        fun `postal code with fifth digit as 5 returns false`() {
            // Postal code where the fifth digit is '5'
            val postalCodeWithFifthFive = "1234557891"
            assertFalse(validator(postalCodeWithFifthFive))
        }

        @Test
        fun `postal code with sixth digit as 0 returns false`() {
            // Postal code where the sixth digit is '0'
            val postalCodeWithSixthZero = "1234507891"
            assertFalse(validator(postalCodeWithSixthZero))
        }

        @Test
        fun `postal code with invalid last four digits returns false`() {
            // Postal code with non-numeric characters in the last four digits
            val postalCodeWithInvalidLastFour = "12345678ab"
            assertFalse(validator(postalCodeWithInvalidLastFour))
        }

        @Test
        fun `postal code with last four digits as 0000 returns false`() {
            // Postal code where the last four digits are "0000"
            val postalCodeWithLastFourZeros = "1234560000"
            assertFalse(validator(postalCodeWithLastFourZeros))
        }

        @Test
        fun `postal code with repeated digits returns false`() {
            // Postal code where all digits are the same (e.g., "1111111111")
            val repeatedPostalCode = "1111111111"
            assertFalse(validator(repeatedPostalCode))
        }
    }


}