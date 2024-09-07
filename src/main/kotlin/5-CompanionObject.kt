import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println

/**
 Companion Object :
  in hamoon mani static java ro mide ama vaqan static nist..
  va ba in companion object mishe dar hafeze faqat yek variable dasht va azash estefade kard..
  hatman bayad dakhel ye class tarif beshan m=va mishe hata barshun esm ham gozasht
  har class fagat ye block companion object mitune dashte bashe
 * */

// sample

annotation class Test {
    companion object comTest {
        val myName = "Hsn"
        fun showMyName() = myName
    }
}


fun main() {
    // dg niyazi nist object ghiri konim..
    // Test.showMyName()
}
