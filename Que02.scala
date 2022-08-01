object PatternMatching{

    def Checking(x:Int):Unit = x match{
        case x if(x < 0) => println("You have entered Negative number")
        case x if(x == 0) => println("You have entered Zero number")
        case x if(x % 2 == 0) => println("You have entered Even number")
        case _ => println("You have entered Odd number")
    }

    def main(args:Array[String]):Unit = {

        print("Enter a number : ")
        val number = scala.io.StdIn.readInt()
        Checking(number)
    }

}