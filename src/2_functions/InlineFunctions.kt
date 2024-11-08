package `2_functions`

fun main() {
    println("Starting main")

    inlineExample {
        println("Inside inline function")
    }

    nonInlineExample({ println("Inline part") }, { println("Noinline part") })

    println("End of main")
}

// Inline function
inline fun inlineExample(block: () -> Unit) {
    println("Before block")
    block()
    println("After block")
}

// Inline function with `noinline` parameter
inline fun nonInlineExample(inlineBlock: () -> Unit, noinline noInlineBlock: () -> Unit) {
    println("Before inlineBlock")
    inlineBlock()
    println("Before noInlineBlock")
    noInlineBlock()  // This part will not be inlined
    println("After noInlineBlock")
}

// Inline function with crossinline
inline fun crossInlineExample(crossinline action: () -> Unit) {
    val runnable = Runnable { action() }
    runnable.run()
}
