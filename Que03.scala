object format {

    def toUpper(text:String):String = text.toUpperCase()
    def toLower(text:String):String = text.toLowerCase()

   
    def formatNames(name: String)(indexNo: Int*)(convet: String => String): String = {

        if(indexNo.isEmpty){
          return convet(name)
        }

        var temp = ""
        var i = 0

        while(i < name.length()){

            if(indexNo.contains(i)) temp = temp + convet(name.charAt(i).toString)
            else temp = temp + name.charAt(i).toString
            i= i + 1
        }

        temp
  }

    def main(args: Array[String]): Unit = {

        println(formatNames("Benny")()(toUpper))
        println(formatNames("Niroshan")(0,1)(toUpper))
        println(formatNames("Saman")()(toLower))
        println(formatNames("Kumara")(5)(toUpper))

    }
}
