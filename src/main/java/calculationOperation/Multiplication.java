package calculationOperation;

public class Multiplication extends Operation {// Класс Умножение наследует от класса Операция

    public Multiplication(float numberOne, float numberTwo) { // Конструктор полей от родительского класса
        super(numberOne, numberTwo);
    }

    @Override
    public float getCalculationResult() { // переопределяем метод родительского класса для получения операции калькулятора
        return getNumberOne() * getNumberTwo();
    }
}