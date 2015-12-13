package expression.atomic;

import expression.Expression;
import printer.Printer;

public abstract class Atomic extends Expression {

	public <P extends Printer> String print(P printer) {
		return printer.visit(this);
	}
}