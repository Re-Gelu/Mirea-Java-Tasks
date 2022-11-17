package Java_task_26.ex4;

public class VariableNotFoundException extends IllegalArgumentException{
    VariableNotFoundException(String msg){
        super(msg);
    }
}