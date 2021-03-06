package expression.binary;

import expression.Expression;

public class Equality extends BinaryExpression {

    public Equality(Expression operand1, Expression operand2) {
        super(operand1, operand2, "=");
    }

    @Override
    public int compute(int x, int y) {
        return x == y ? 1 : 0;
    }

}
