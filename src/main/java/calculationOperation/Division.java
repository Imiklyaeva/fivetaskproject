package calculationOperation;

public class Division extends Operation {// Класс Деление наследует от класса Операция

    public Division(float numberOne, float numberTwo) { // Конструктор полей от родительского класса
        super(numberOne, numberTwo);
    }

    @Override
    public float getCalculationResult() { // переопределяем метод родительского класса для получения операции калькулятора

        return getNumberOne() / getNumberTwo();


    }
}