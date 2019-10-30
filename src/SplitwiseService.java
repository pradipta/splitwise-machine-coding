import java.util.Date;
import java.util.List;

public class SplitwiseService {
	public static Expense createExpense(ExpenseType type, double amount, User payee, List<Split> splits) {
		switch (type) {
		case EQUAL:
			int totalSplits = splits.size();
			double splitAmount = ((double) Math.round(amount * 100 / totalSplits)) / 100;
			for (Split split : splits) {
				split.setAmount(splitAmount);
			}
			//to avoid decimal error. Like 100/3 = 33.33, adds up to 99.99. To avoid that
			splits.get(0).setAmount(splutAmount + amount - splitAmount*totalSplits);
			return new EqualExpense(amount, payee, new Date(), splits);
		default:
			System.out.println("Not implemented yet");
		}
	}
}
