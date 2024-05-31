fun main() {
    // even numbers
    outputEvenNumbers(100)

    // odd numbers
    //outputOddNumbers(100)

    // factorial
    //outputFactorialNumber(7)

    // fibonacci
    //outputFibonacciNumbers(100)
}

fun outputEvenNumbers(quantity: Int ) {
    println("Output of even numbers from 1 to $quantity:")
    for (i in 1..quantity) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}

fun outputOddNumbers(quantity: Int) {
    println("Output of odd numbers from 1 to $quantity:")
    for (i in 1..quantity) {
        if (i % 2 == 1) {
            println(i)
        }
    }
}

fun outputFactorialNumber(number: Int) {
    println("Factorial of the number $number:")
    var count = 1
    for (i in 1..number) {
        val factorial = count * i
        println(factorial)
        count = factorial
    }
}

fun outputFibonacciNumbers(quantity: Int) {
    println("Output Fibonacci number up to $quantity:")
    var a = 0
    var b = 1
    var c: Int
    for (i in 1..quantity) {
        c = a + b
        a = b
        b = c
        println(b)
    }
}