package Java_task_26.ex3;


public class Add extends Operator {
    public Add(Operand left, Operand right) {
        super(left, right);
    }

    public Add(Operand left, Variable vRight) {
        super(left, vRight);
    }

    public Add(Variable vLeft, Variable vRight) {
        super(vLeft, vRight);
    }

    public Add(Variable vLeft, Operand right) {
        super(vLeft, right);
    }

    @Override
    public double getValue() {
        return left.getValue() + right.getValue();
    }
}
