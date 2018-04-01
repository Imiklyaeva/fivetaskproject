package floatNumber;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FloatNumber {// Класс Дробное число

    public FloatNumber() {
    }

    /**
     * Метод для ввода дробного числа из консоли
     *
     * @return Дробное число
     */
    public float getSomeFloatnumber() {
        System.out.println("Калькулятор.Введите дробное число(разделитель ,) :");// Ввод из консоли дробного числа
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }
}
