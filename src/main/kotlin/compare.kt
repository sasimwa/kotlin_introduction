fun main(args: Array<String>) {
    print("Enter Your Age")
    var age:Int = readln()!!.toInt()


    if (age >= 18) {
        print("Welcome to the Club")
    }
    else{
        print("Sorry we dont admit underage")
    }




}