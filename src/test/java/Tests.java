import calculationOperation.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.Infinity;


/**
 * Задание 8.Покрыть Unit тестами последний проект с калькулятором
 *
 * @author Irina Miklyaeva
 */

public class Tests {

    @Test
    public void weShouldGetSumOfTwoNumbersInAddition() { // Тест на проверку того,что Addition выполняет сложение 2 чисел
        Addition addition = new Addition(2, 4);
        Assert.assertEquals(6, addition.getCalculationResult(), 0);
    }

    @Test
    public void weShouldGetFirstNumberMinusSecondNumberInSubtraction() {// Тест на проверку того, что Subtraction выполняет вычитание второго числа из первого
        Subtraction subtraction = new Subtraction(8, 3);
        Assert.assertEquals(5, subtraction.getCalculationResult(), 0);
    }

    @Test
    public void weShouldGetFirstNumberDivisionedBySecondNumberInDivision() {// Тест на проверку того, что Division выполняет деление первого числа на второе
        Division division = new Division(6, 4);
        Assert.assertEquals(1.5, division.getCalculationResult(), 0);
    }

    @Test
    public void weShouldGetFirstNumberMultiplicatedBySecondNumberInMultiplication() {// Тест на проверку того, что Multiplication выполняет умножение первого числа на второе
        Multiplication multiplication = new Multiplication(-5, 0);
        Assert.assertEquals(0, multiplication.getCalculationResult(), 0);
    }

    @Test
    public void weShouldGetInfinityInDivisionWhenSecondNumberIsZero() {// Тест на проверку того, что при делении на нуль мы получаем Бесконечность
        Division division = new Division(4, 0);
        Assert.assertEquals(Infinity, division.getCalculationResult(), 0);
    }

    @Test(expected = InputMismatchException.class)
    public void waitExceptionInputMismatchWhenTryToMakeAnyOperationWhisStringType() throws FileNotFoundException {// считывам из файла строку вместо числа и передаем экземпляру класса Операция, получаем исключение
        Scanner scanner = new Scanner(new File("C:\\ProjectIdea\\FiveTaskProject\\src\\main\\resources\\exampl.txt"));
        float number = scanner.nextFloat();
        new Operation(number, 2) {
            @Override
            public float getCalculationResult() {
                return super.getCalculationResult();
            }
        };
    }

    @Test
    public void expectedZeroInResultOfGetCalculationResultOfObjectOperationClass() {// проверяем, что метод getCalculationResult() абстрактного класса Операция всегда возвращает нуль
        Operation operation = new Operation(3, 2) {
            @Override
            public float getCalculationResult() {
                return super.getCalculationResult();
            }
        };
        Assert.assertEquals(0, operation.getCalculationResult(), 0);
    }
}




