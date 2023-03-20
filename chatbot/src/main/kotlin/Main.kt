package bot
import  java.util.Scanner

val scanner = Scanner(System.`in`)

fun greet(assistantName: String, birthyear: String) {
    println("Hello! My name is $assistantName.")
    println("I was created in$birthyear.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, $name!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val (r3, r5, r7) = Array(3) { readln().toInt() }
    val age: Int = (r3 * 70 + r5 * 21 + r7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}
fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    println("Please type a number")

    val count = readln().toInt()
    for (i in 0..count) {
        println("$i!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    println("Why do we use methods?")
    println("1. To repeat a statement multiple times")
    println("2. To decompose a programe into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")
    var answer = ""
    while (answer != "2") {
        answer = readln()
        if (answer == "2") println("Congratulations, have a nice day!") else println("Please, try again.")
    }
}

fun end() {
    println("Congratulations, have a nice day!")
}

fun main() {
    greet("Aid", "2023")
    remindName()
    guessAge()
    count()
    test()
    end()
}