

@Target(AnnotationTarget.CLASS , AnnotationTarget.FUNCTION)
annotation class Smart()


fun main(){

    val phoneReflectionObj =Phone::class
    println(phoneReflectionObj.annotations)
}
