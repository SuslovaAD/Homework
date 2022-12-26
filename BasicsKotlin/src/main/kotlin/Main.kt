import java.util.*

fun main(args: Array<String>) {
    println("Суслова Анастасия, техник-программист")
    hw1()
    hw2()
}

fun hw1(){
    val myVariable1: Byte = 127
    val myVariable2: Short = 1567
    val myVariable3: Int = 267983
    val myVariable4: Long = 2147483647
    val myVariable5: Float = 1.7F
    val myVariable6: Double = -1.4
    val myVariable7: Boolean = true
    val myVariable8: Char = 'a'
    val myVariable9: String = "Основы"
    println("byte = " + myVariable1 +
            "\nshort = "+ myVariable2 + "\nint = " + myVariable3 +
            "\nlong = " + myVariable4 + "\nfloat = " + myVariable5 +
            "\ndouble = " + myVariable6 + "\nboolean = " + myVariable7 +
            "\nchar = " + myVariable8 + "\nString = " + myVariable9)
}
fun hw2(){
    val scanner = Scanner(System.`in`)
    println("Введите любое слово или предложение:")
    val str: String = scanner.nextLine()
    val anotherString = "Основы языка Java"
    val addString = "выполнено."
    val buffer = StringBuffer("Домашняя")

    println("Длина строки = " + str.length +
            "\nСтрока пустая? " + str.isEmpty() +
            "\nПервый символ - " + str[0] +
            "\nСтроки одинаковы? " + (str == anotherString) +
            "\nСтроки одинаковы, независимо от регистра? " + str.equals(anotherString, ignoreCase = true) +
            "\nСтрока начитается со слова 'Основы'? " + str.startsWith("Основы") +
            "\nВторое слово строки 'языка'? " + str.startsWith("языка",7) +
            "\nСтрока заканчивается словом 'Java'? " + str.endsWith("Java") +
            "\nВ строке есть слово 'Основы'? " + str.contains("Основы") +
            "\nНовая строка: " + str + ". Конец" +
            "\nЗаменить символ 'а' на 'б'? " + str.replace('а', 'б') +
            "\nЗаменить символы 'но' на 'дл'? " + str.replace("но", "дл") +
            "\nВведенная строка в нижнем регистре: " + str.lowercase(Locale.getDefault()) +
            "\n" + String.format("Задание %s",addString) +
            "\nИзменённая строка: " + buffer.append(" работа"))
}
