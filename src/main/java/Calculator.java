import calculationOperation.Addition;
import calculationOperation.Division;
import calculationOperation.Multiplication;
import calculationOperation.Subtraction;
import floatNumber.FloatNumber;

import java.util.Scanner;

/**
 * Задание 5. Калькулятор ООП
 *
 * @author Irina Miklyaeva
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Новый объект Scanner
        System.out.println("Введите один из предложенных знаков действия:\n'+'сложить;\n'-'вычесть второе число из первого;\n'/'- разделить первое число на второе;\n'*'- умножить;");// Ввод из консоли выбора действия калькулятора
        String calcOperation = scanner.next();// инициализируем переменную Операция калькулятора выбранным действием пользователя
        FloatNumber floatNumberOne = new FloatNumber();// Создали первый объект класса Дробное число
        FloatNumber floatNumberTwo = new FloatNumber();// Создали второй объект класса Дробное число
        if ("+".equals(calcOperation)) {//Если ввели '+' создаем объект класса Сложение
            Addition addition= new Addition(floatNumberOne.getSomeFloatnumber(),floatNumberTwo.getSomeFloatnumber());//передаем ему оба дробных числа
            addition.printResult();// выводим в консоль результат
        } else if ("-".equals(calcOperation)) {// Eсли ввели '-'
            Subtraction subtraction= new Subtraction(floatNumberOne.getSomeFloatnumber(),floatNumberTwo.getSomeFloatnumber());
            subtraction.printResult();
        } else if ("/".equals(calcOperation)) {// Если ввели '/'
            Division division= new Division(floatNumberOne.getSomeFloatnumber(),floatNumberTwo.getSomeFloatnumber());
            division.printResult();
        } else if ("*".equals(calcOperation)) {//Если ввели '*'
            Multiplication multiplication= new Multiplication(floatNumberOne.getSomeFloatnumber(),floatNumberTwo.getSomeFloatnumber());
            multiplication.printResult();
        } else System.out.println("Введен неверный знак действия");// Вывод ошибки в консоль
        scanner.close();// закрываем сканер
    }
}
