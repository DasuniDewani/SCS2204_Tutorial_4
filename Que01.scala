import scala.compiletime.ops.float
object Interect {

    def calculateInterest(x:Float):Float = x match {

        case x if(x <= 20000) => x * 0.02f
        case x if(x <= 200000) => x * 0.04f
        case x if(x > 200000 && x <= 2000000) => x * 0.035f
        case x => x * 0.065f

    }



    def main(args:Array[String]): Unit ={

        print("Enter the deposite amount: ")
        var amount:Float = scala.io.StdIn.readFloat()
        val interest = calculateInterest(amount);
        println("Total interest that the money earns in year: Rs" + interest)
    }
}