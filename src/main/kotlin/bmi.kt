fun main(args: Array<String>) {

    print("Enter your weight")
    var weight:Int = readln()!!.toInt()
    print("Enter your height")
    var height= readln()!!.toFloat()
    var bmi = weight/(height * height)

    print(bmi)

    if (bmi <= 18) {
        println("Underweight")
    }
    else if (bmi <= 29) {
        println("Normal weight")
    }
    else if (bmi <= 34) {
        println("Overweight")
    }
    else {
        println("Obese")
    }

}