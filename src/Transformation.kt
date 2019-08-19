import java.io.PrintWriter

interface Transformation  {

    fun transformation (value : Double, valuta : String, toDollar : Double, toEuro : Double) {

        val intermediate : Int = (value*100).toInt()
        val result : Double
        result = intermediate/100.toDouble()
        when(valuta){
            "$"->{

                val writer= PrintWriter("result.log")
                print("$ ")
                println("$result")
                writer.appendln("якщо за 1 долар дають $toDollar євро, а за 1 євро $toEuro долара: \n $ $result \n")
                writer.close()
            }
            "eur"->{
                val writer= PrintWriter("result.log")
                print("$result")
                println("eur")
                writer.appendln("якщо за 1 долар дають $toDollar євро, а за 1 євро $toEuro долара: \n $ $result \n")
                writer.close()

            }
        }


        //print("$result")
    }



}
