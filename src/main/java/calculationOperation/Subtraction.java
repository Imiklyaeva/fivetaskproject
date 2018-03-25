package calculationOperation;

public class Subtraction extends Operation {// Класс Вычитание наследует от класса Операция

    public Subtraction(float numberOne, float numberTwo) { // Конструктор полей от родительского класса
        super(numberOne, numberTwo);
    }

    @Override
    public float getCalculationResult() { // переопределяем метод родительского класса для получения операции калькулятора
        return getNumberOne() - getNumberTwo();
    }
}
