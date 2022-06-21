import org.w3c.dom.Node

fun main(args: Array<String>)
{
    //zad1()
    //zad2()
    zad3()

}
//1 задание
fun zad1(){
    val x:Int = 1234
    val x1:Int = 1234
    val y:Int = x*x1
    println(y)
}
//2 задание
fun zad2()
{
    val TimeYellow:Int = 1
    val TimeRed:Int = 2
    val TimeGreen:Int = 3

    val t:Double = 66.66

    val otv:Double = t%(TimeYellow + TimeRed + TimeGreen)

    if(otv<TimeYellow){
        println("Зеленый")
    } else {
        if(t < TimeGreen + TimeYellow){
            println("Желтый")
        } else {
            println("Красный")
        }
    }

}
fun zad3()
{
    var i:Int = 1
    var s: Int = 0

    while (i<=99){
        s += i
        i = i + 2
    }
    println("Результат: $s")
}


