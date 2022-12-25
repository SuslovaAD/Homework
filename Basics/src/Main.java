import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Суслова Анастасия, техник-программист");

        byte myVariable1 = 127;
        short myVariable2 = 1567;
        int myVariable3 = 267983;
        long myVariable4 = 2147483647;
        float myVariable5 = 1.7f;
        double myVariable6 = -1.4;
        boolean myVariable7 = true;
        char myVariable8 = 'a';
        String myVariable9 = "Основы";
        System.out.println("byte = " + myVariable1 +
                "\nshort = "+ myVariable2 + "\nint = " + myVariable3 +
                "\nlong = " + myVariable4 + "\nfloat = " + myVariable5 +
                "\ndouble = " + myVariable6 + "\nboolean = " + myVariable7 +
                "\nchar = " + myVariable8 + "\nString = " + myVariable9);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое слово или предложение:");
        String str = scanner.nextLine();
        String anotherString = "Основы языка Java";
        String addString = "выполнено.";
        StringBuffer buffer = new StringBuffer("Домашняя");

        System.out.println("Длина строки = " + str.length() +
                "\nСтрока пустая? " + str.isEmpty() +
                "\nПервый символ - " + str.charAt(0) +
                "\nСтроки одинаковы? " + str.equals(anotherString) +
                "\nСтроки одинаковы, независимо от регистра? " + str.equalsIgnoreCase(anotherString) +
                "\nСтрока начитается со слова 'Основы'? " + str.startsWith("Основы") +
                "\nВторое слово строки 'языка'? " + str.startsWith("языка",7) +
                "\nСтрока заканчивается словом 'Java'? " + str.endsWith("Java") +
                "\nВ строке есть слово 'Основы'? " + str.contains("Основы") +
                "\nНовая строка: " + str.concat(". Конец") +
                "\nЗаменить символ 'а' на 'б'? " + str.replace('а', 'б') +
                "\nЗаменить символы 'но' на 'дл'? " + str.replace("но", "дл") +
                "\nВведенная строка в нижнем регистре: " + str.toLowerCase() +
                "\n" + String.format("Задание %s",addString) +
                "\nИзменённая строка: " + buffer.append(" работа")
        );

    }
}