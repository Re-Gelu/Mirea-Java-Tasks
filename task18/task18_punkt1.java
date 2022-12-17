package task18;

public class task18_punkt1 {
    public void exceptionDemo() {
        System.out.println(2.0 / 0.0);
    }

    public static void main(String[] args) {
        task18_punkt1 task = new task18_punkt1();
        task.exceptionDemo();
    }
}
/*Java floatи doubleтипы, как и почти любой другой язык (и почти любой аппаратный блок FP), реализуют стандарт IEEE 754
для математики с плавающей запятой, который предписывает деление на ноль возвращать специальное значение
«бесконечность». Выброс исключения фактически нарушил бы этот стандарт.
Целочисленная арифметика (реализованная как представление с дополнением до двух в Java и большинстве других языков и
оборудования) отличается и не имеет специальных значений бесконечности или NaN, поэтому создание исключений является
полезным поведением.
 */


/*Если вы разделите double на 0, JVM покажет Infinity .
Приставка: Infinity

Если вы разделите int на 0, то JVM выдаст Arithmetic Exception .
Приставка:Exception in thread "main" java.lang.ArithmeticException: / by zero

Но если мы разделим int на 0.0, то JVM покажет Infinity:
Приставка:Infinity
Это связано с тем, что JVM автоматически вводит приведение int к double, поэтому мы получаем бесконечность вместо ArithmeticException.
*/
