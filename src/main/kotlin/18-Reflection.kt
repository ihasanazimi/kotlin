import kotlin.reflect.full.memberFunctions

fun main() {
val myList = listOf(1,2,3,4,5)

    val functions = myList::class.isValue
    println(functions)

}


