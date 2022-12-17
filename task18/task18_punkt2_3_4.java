package task18;

public class task18_punkt2_3_4 {
    public void exceptionDemo() {
        // в блок try заключаем код, в котором может произойти исключение
        try {
            System.out.println(2 / 0);
            // в блок  catch заключаем код по обработке исключения
        } catch (Exception e) {
            System.out.println("Поймали исключение Exception");
            // определяет блок кода, который является необязательным, но при его наличии выполняется в любом случае
            // независимо от результатов выполнения блока try.
        } finally {
            System.out.println("Это в любом случае будет в консоли $_$");
        }
    }

    public static void main(String[] args) {
        task18_punkt2_3_4 task = new task18_punkt2_3_4();
        task.exceptionDemo();
    }
}
