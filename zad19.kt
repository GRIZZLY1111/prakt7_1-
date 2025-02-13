fun main() {
    try
    {
        println("Введите трехзначное число K")
        val f = readLine()!!.toInt()
        when (f)
        {
            in 100..999->
            {
                val x = f.toString()
                val y = x[2]
                val z = x[1]
                val i = x[0]
                print(y);
                print(z);
                print(i);
            }
            else ->
            {
                println("Введенное число не является трехзначным")
            }
        }
    }
    catch (e:NumberFormatException)
    {
        println("Неверный ввод")
    }
}