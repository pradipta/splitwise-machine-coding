import java.util.*;

public class EqualExpense extends Expense {
	public EqualExpense(double amount, User payee, Date now, List<Split> splits) {
		super(amount, payee, now, splits);
	}

	@Override
	public boolean validate() {
		for (Split split : super.getSplits()) {
			if (!(split instanceof EqualSplit)) {
				return false;
			}
		}
		return true;
	}
}
