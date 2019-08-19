class Euro : Course, Transformation {

    fun result (euro: Double, operation : String, dollar : Double){

        val sum: Double


        when (operation){
            "+" -> {
                sum = euro+dollar*toEuro()
                println("якщо за 1 долар дають ${toEuro()} євро, а за 1 євро ${toDollar()} долара:")
                transformation(sum, "eur", toDollar(),toEuro())
                                           }
            "-" -> {
                sum = euro- dollar*toEuro()
                println("якщо за 1 долар дають ${toEuro()} євро, а за 1 євро ${toDollar()} долара:")
                transformation(sum, "$", toDollar(),toEuro())
            }
            else -> println("Вказано не вірний математичний знак. Має бути + або -.")
        }
    }
}
