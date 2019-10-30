import java.util.*;

public class ExpenseManager {
	List<Expense> expenses;
	// userMap: userId to User
	Map<String, User> userMap;
	Map<String, Map<String, Double>> balanceSheet;

	public ExpenseManager() {
		this.expenses = new ArrayList<Expense>();
		this.userMap = new HashMap<String, User>();
		this.balanceSheet = new HashMap<String, Map<String, Double>>();
	}

	public void addUder(User user) {
		userMap.put(user.getId(), user);
		balanceSheet.put(user.getId(), new HashMap<String, Double>());
	}
	
	public void addExpense (ExpenseType type, double amount, User payee, List<Split> splits) {
		//TODO add expense, add to expenses list, add to balance sheet
		Expense newExpense = SplitwiseService.createExpense(type, amount, payee, splits);
		expenses.add(newExpense);
	}
}
