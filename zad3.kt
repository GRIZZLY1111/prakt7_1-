fun main() {
    try
    {
        println("Введите первый член прогрессии")
        val x = readLine()!!.toDouble()
        println("Введите знаменатель прогрессии")
        val y = readLine()!!.toDouble()
        println("Введите номер K")
        val k = readLine()!!.toDouble()
        println("Введите номер P")
        val p = readLine()!!.toDouble()
        if (k<p)
        {
            var S2 = ((x*(Math.pow(y,p)-1))/(y-1))
            val S1 = ((x*(Math.pow(y,x)-1))/(y-1))
            S2=S2-S1;
            println(S2)
        }
        else
        {
            println("Ошибка заданные числа не соответсвуют условиям задачи")
        }
    }
    catch (e:NumberFormatException)
    {
        println("Неверный ввод")
    }
}