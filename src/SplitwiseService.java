import java.util.Date;
import java.util.List;

public class SplitwiseService {
	public static Expense createExpense(ExpenseType type, double amount, User payee, List<Split> splits) {
		switch (type) {
		case EQUAL:
			return new EqualExpense(amount, payee, new Date(), splits);
		default:
			return new EqualExpense(amount, payee, new Date(), splits);
		}
	}
}
