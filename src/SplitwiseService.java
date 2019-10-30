import java.util.Date;
import java.util.List;

public class SplitwiseService {
	public static Expense createExpense(ExpenseType type, double amount, User paidBy, List<Split> splits, String label) {
		switch (type) {
		//change to cases for EQUAL, EXACT, PERCENT when implemented
		default:
			int totalSplits = splits.size();
			double splitAmount = ((double) Math.round(amount * 100 / totalSplits)) / 100;
			for (Split split : splits) {
				split.setAmount(splitAmount);
			}
			//to avoid decimal error. Like 100/3 = 33.33, adds up to 99.99. To avoid that
			splits.get(0).setAmount(splitAmount + amount - splitAmount*totalSplits);
			return new EqualExpense(amount, paidBy, new Date(), splits, label);
		}
	}
}
