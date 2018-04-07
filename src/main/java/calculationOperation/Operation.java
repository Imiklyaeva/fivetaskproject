package calculationOperation;

public abstract class Operation {// Абстрактный класс Операция в пакете Операции калькулятора
    private float numberOne; // Поле первое дробное число;
    private float numberTwo; // Поле второе дробное число;

    protected Operation(float numberOne, float numberTwo) {// Конструктор для полей класса
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    float getNumberOne() {// геттер для первого дробного числа
        return numberOne;
    }

    float getNumberTwo() { // геттер для второго дробного числа
        return numberTwo;
    }

    public float getCalculationResult() {// Метод для получения результа выполнения операции калькулятора
        return (float) 0;
    }

    public void printResult() { // Метод для вывода на консоль результата выполнения операции калькулятора с точностью до 4 знаков после запятой
        System.out.printf("Результат = %.4f ", getCalculationResult());
    }
}
