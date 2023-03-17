
fun main (){
    oddNumbers()
    var q=number(arrayOf("Nakakande","Bridget","Rebecca","Ian","Dan"))
    println(q)
    robotics(5)
    robotics(7)
    robotics(26)
    multiple()

}
//Create a function that prints out all the odd numbers between 1 and 100 (2pts)


fun oddNumbers(){
    for (x in 1..100){
        if (x%2!=0){
            println(x)
        }
    }

}


//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)


fun number(names:Array<String>) :Int{
    var y=0
    for (cha in names){
        if (cha.length>5){

            y++
        }
    }

    return y
}


// You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)


fun robotics(age:Int){

    if (age in 0..5){
        println("serve a glass of milk")

    }
    else if(age in 7..14 ){
        println("serves a bottle of fanta orange")

    }
    else{

        println("serve a bottle of coca cola.")

    }
}


//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
fun multiple(){
    for (x in 1..100){
        when{
            x%3==0 && x%5==0 -> println(" FizzBuzz")
            x%3==0 -> println("fizz")
            x%5==0 -> println("Buzz")
            else -> println(x)


        }

    }

}
