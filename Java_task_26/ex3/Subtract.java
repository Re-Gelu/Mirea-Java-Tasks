package Java_task_26.ex3;


public class Subtract extends Operator {
    public Subtract(Operand left, Operand right) {
        super(left, right);
    }

    public Subtract(Operand left, Variable vRight) {
        super(left, vRight);
    }

    public Subtract(Variable vLeft, Variable vRight) {
        super(vLeft, vRight);
    }

    public Subtract(Variable vLeft, Operand right) {
        super(vLeft, right);
    }

    @Override
    public double getValue() {
        return left.getValue() - right.getValue();
    }
}
