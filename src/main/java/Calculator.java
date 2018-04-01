import calculationOperation.Addition;
import calculationOperation.Division;
import calculationOperation.Multiplication;
import calculationOperation.Subtraction;
import floatNumber.FloatNumber;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Задание 7. Калькулятор ООП+обработка исключения по вводу в консоль не дробных чисел
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
         try {
             Addition addition = new Addition(floatNumberOne.getSomeFloatnumber(), floatNumberTwo.getSomeFloatnumber());//передаем ему оба дробных числа
             addition.printResult();// выводим в консоль результат
         }catch (InputMismatchException e){
             System.out.println ("Введено не дробное число");
         }
        } else if ("-".equals(calcOperation)) {// Eсли ввели '-'
            try {
                Subtraction subtraction = new Subtraction(floatNumberOne.getSomeFloatnumber(), floatNumberTwo.getSomeFloatnumber());
                subtraction.printResult();
            }catch (InputMismatchException e) {
                System.out.println("Введено не дробное число");
            }
        } else if ("/".equals(calcOperation)) {// Если ввели '/'
            try {
                Division division = new Division(floatNumberOne.getSomeFloatnumber(), floatNumberTwo.getSomeFloatnumber());
                division.printResult();
            } catch (InputMismatchException e){
                System.out.println("Введено не дробное число");
            }
        } else if ("*".equals(calcOperation)) {//Если ввели '*'
            try {
                Multiplication multiplication = new Multiplication(floatNumberOne.getSomeFloatnumber(), floatNumberTwo.getSomeFloatnumber());
                multiplication.printResult();
            } catch (InputMismatchException e) {
                System.out.println("Введено не дробное число");
            }
        } else System.out.println("Введен неверный знак действия");// Вывод ошибки в консоль
        scanner.close();// закрываем сканер
    }
}
