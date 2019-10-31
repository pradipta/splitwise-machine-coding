import java.util.ArrayList;
//import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Splitwise {
	public static void main(String[] args) {
		ExpenseManager expenseManager = new ExpenseManager();

		expenseManager.addUser(new User("pradipta", "Pradipta Sarma", "pradiptasarma@outlook.com", "8133910729"));
		expenseManager.addUser(new User("nasir", "Nasir Ahmed", "nasirkvbarpeta@gmail.com", "0000999909"));
		expenseManager.addUser(new User("hemant", "Hemant Saikia", "hmnt.ska23@gmail.com", "7123123123"));
		expenseManager.addUser(new User("asmita", "Asmita Dutta", "asmita.dutta@outlook.com", "8133910729"));
		expenseManager.addUser(new User("jishnu", "Jishnu Sankar Bora", "jb@al.com", "1231231232"));
//
//		String paidBy = "pradipta";
//		Double amount = (double) 100;
//		//int noOfUsers = 4;
//		List<Split> splits = new ArrayList<>();
//		String label = "IceCream";
//		//Make splits
//
//		splits.add(new EqualSplit(expenseManager.userMap.get("pradipta"), amount));
//		splits.add(new EqualSplit(expenseManager.userMap.get("nasir"), amount));
//		splits.add(new EqualSplit(expenseManager.userMap.get("asmita"), amount));
//		splits.add(new EqualSplit(expenseManager.userMap.get("hemant"), amount));
//		splits.add(new EqualSplit(expenseManager.userMap.get("jishnu"), amount));
//
//		expenseManager.addExpense(ExpenseType.EQUAL, amount, paidBy, splits, label);
//
//		expenseManager.showBalanceForUser("pradipta");

		Scanner scanner = new Scanner(System.in);
		while (true){
			System.out.println("Select mode: Create Expense [1], Show Balance [2]");
			String input = scanner.nextLine();
			switch (input){
				case "1":
					//new expense
					createExpense(expenseManager, scanner);
					break;
				case "2":
					break;
			}
		}
	}

	private static void createExpense(ExpenseManager expenseManager, Scanner scanner) {
		System.out.println("Enter no. of Users:");
		int noOfUsers = Integer.parseInt(scanner.nextLine());
		List<Split> splits = new ArrayList<>();
		System.out.println("What did you spend on?");
		String label = scanner.nextLine();
		System.out.println("Enter amount");
		double amount = Double.parseDouble(scanner.nextLine());
		for (int i = 0; i<noOfUsers; i++){
			System.out.println("Participant "+(i+1));
			System.out.println("Enter user id: ");
			String userIdNow = scanner.nextLine();
			splits.add(new EqualSplit(expenseManager.userMap.get("pradipta"), amount));
		}
	}
}