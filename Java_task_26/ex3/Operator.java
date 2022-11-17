package Java_task_26.ex3;

public abstract class Operator extends Operand{
    protected Operand left, right;
    protected Variable vLeft, vRight;
    public Operator(Operand left, Operand right){
        this.left = left;
        this.right = right;
    }

    public Operator(Operand left, Variable vRight) {
        this.left = left;
        this.vRight = vRight;
    }

    public Operator(Variable vLeft, Variable vRight) {
        this.vLeft = vLeft;
        this.vRight = vRight;
    }
    public Operator (Variable vLeft, Operand right){
        this.vLeft = vLeft;
        this.right = right;
    }

    @Override
    public abstract double getValue();

    public double evaluate(double v){
        if(right == null) right = vRight.toConst(v);
        if(left == null) left = vLeft.toConst(v);
        if(left instanceof Operator) ((Operator) left).evaluate(v);
        if(right instanceof Operator)((Operator) right).evaluate(v);
        return getValue();
    }
}
