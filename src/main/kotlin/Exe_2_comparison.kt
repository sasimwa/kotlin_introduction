fun main(args: Array<String>) {

    print("Enter Marks")
    var mark:Int = readln()!!.toInt()

    if (mark >=80) {
        print("Excellent")
    }
    else if (mark >=70) {
        print("Very Good")
    }
    else if (mark >=60) {
        print("Good")
    }
    else if (mark >=50) {
        print("Fair")
    }
    else{
        print("Below Expectations")
    }



}