package Java_task_19.ex1;

import java.math.BigInteger;

public class InnNotValidException extends Exception {

    private BigInteger innNum;

    public InnNotValidException(BigInteger inn){
        super("ИНН с номером "+ inn + " не действителен!");
        innNum = inn;
    }

    public BigInteger getInnNum() {
        return innNum;
    }
}
