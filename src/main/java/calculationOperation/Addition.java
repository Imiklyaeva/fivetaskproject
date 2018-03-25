package calculationOperation;

public class Addition extends Operation {// Класс Сложение наследует от класса Операция

    public Addition(float numberOne, float numberTwo) {// Конструктор полей от родительского класса
        super(numberOne, numberTwo);
    }

    @Override
    public float getCalculationResult() {// переопределяем метод родительского класса для получения операции калькулятора
        return getNumberOne() + getNumberTwo();
    }
}
