package Java_task_26.ex3;


public class Multiply extends Operator {
    public Multiply(Operand left, Operand right) {
        super(left, right);
    }

    public Multiply(Operand left, Variable vRight) {
        super(left, vRight);
    }

    public Multiply(Variable vLeft, Variable vRight) {
        super(vLeft, vRight);
    }

    public Multiply(Variable vLeft, Operand right) {
        super(vLeft, right);
    }

    @Override
    public double getValue() {
        return left.getValue() * right.getValue();
    }
}
