// "Add 'open fun f()' to 'A'" "true"
open class A {
    open fun f() {
    }
}

fun test() {
    val some = object : A() {
        <caret>override fun f() {}
    }
}