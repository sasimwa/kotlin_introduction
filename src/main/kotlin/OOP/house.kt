package OOP

class house(owner:String,location:String,rooms:Int,color:String) {

    init {
        println("Owned by $owner")
        println("Is located at $location")
        println("Has $rooms")
        println("House is $color")
    }




}

fun main(args: Array<String>) {

    var house_one = house("Chantel","Kiambu",4,"Blue")
    var house_two = house("Kirui","Westlands",6,"Red")
    var house_three = house("Collins","Kabete",8,"White")
    var house_four = house("Jane","Loresho",12,"Black")



}

