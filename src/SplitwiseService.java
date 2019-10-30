import java.util.Date;
import java.util.List;

public class SplitwiseService {
	public static Expense createExpense(ExpenseType type, double amount, User payee, List<Split> splits) {
		switch (type) {
		case EQUAL:
			int totalSplits = splits.size();
			return new EqualExpense(amount, payee, new Date(), splits);
		default:
			System.out.println("Not implemented yet");
		}
	}
}
