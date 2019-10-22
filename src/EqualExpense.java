import java.util.*;

public class EqualExpense extends Expense{
	public EqualExpense(double amount, User payee, Date now, List<Split> splits) {
		super(amount, payee, now, splits);
	}
	
	@Override
	public boolean validate(){
		for (Split each : super.getSplits()) {
			//TODO Validate
			if (each == super.getSplits().get(0)) {
				break;
			}
		}
		return true;
	}
}
