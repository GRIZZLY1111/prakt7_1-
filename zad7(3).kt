fun main() {
    try
    {
        println("Введите по очереди x, y, z")
        var x = readLine()!!.toDouble()
        var y = readLine()!!.toDouble()
        var z = readLine()!!.toInt()
        when(z) {
            0 -> println("На ноль делить нельзя дайте другое значение переменной")
            else -> {
                z = (z * z);
                val b = (1 + (z.toDouble() / (3 + (z.toDouble() / 5))))
                x = ((x - (3.14 / 6)))
                x = ((Math.cos(x)) * 2)
                y = (Math.sin(y))
                y = (y * y)
                y = (y + (1.0 / 2))
                val a = (x / y)
                println("b = " + b + " a = " + a);
            }
        }
    }
    catch (e:NumberFormatException)
    {
        println("Неверный ввод")
    }
}