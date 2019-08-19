class Dollar : Course, Transformation  {


    fun result (euro: Double, operation : String, dollar: Double){

        val sum: Double

        when (operation){
            "+" -> {
                sum = euro*toDollar()+dollar
                println("якщо за 1 долар дають ${toDollar()} євро, а за 1 євро ${toEuro()} долара:")
                transformation(sum, "$", toDollar(),toEuro())

            }
            "-" -> {
                sum = euro*toDollar()- dollar
                println("якщо за 1 долар дають ${toDollar()} євро, а за 1 євро ${toEuro()} долара:")
                transformation(sum, "$", toDollar(),toEuro())

            }
            else ->println("Вказано не вірний математичний знак. Вкажіть + або -.")

        }

    }
}