
class Calculator{
    fun add(a: Int, b: Int): Int {
        return a + b
    }
}


fun isValidPostalCode(postalCode: String): Boolean {

    // Rule 1: The number of postal code characters should be 10 digits.
    if (postalCode.length != 10) {
        return false
    }

    // Rule 2: In the first five digits of the postal code, 0 and 2 are not valid.
    val firstFive = postalCode.substring(0, 5)
    if (firstFive.contains('0') || firstFive.contains('2')) {
        return false
    }

    // Rule 3: The fifth digit of the postal code cannot be 5.
    if (postalCode[4] == '5') {
        return false
    }

    // Rule 4: The sixth digit of the postal code cannot be 0.
    if (postalCode[5] == '0') {
        return false
    }

    // Rule 5: The last four digits of the postal code must be valid numbers (from 0 to 9).
    val lastFour = postalCode.substring(6)
    if (!lastFour.all { it.isDigit() }) {
        return false
    }

    // Rule 6: Inserting "0000" in the last four digits of the postal code is invalid.
    if (lastFour == "0000") {
        return false
    }

    // Rule 7: All repeated numbers at the end of the postal code are invalid, such as "1111111111".
    if (postalCode.all { it == postalCode[0] }) {
        return false
    }

    return true
}


