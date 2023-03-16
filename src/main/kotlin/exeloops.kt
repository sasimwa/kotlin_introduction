fun main(args: Array<String>) {
    for (i in 2..99)

        if (i % 3 == 0) {
            println("$i Fizzbuzz")
        }
        else if (i % 5 == 0) {
            println("$i buzz")
        }
        else if (i % 15 == 0) {
            println("$i Fizz")
        }
        else {
            println("$i not divisible")
        }








}