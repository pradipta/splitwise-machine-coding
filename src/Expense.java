import java.util.*;

public abstract class Expense {
	// private String id;
	private double amount;
	private User payee;
	private Date createdDate;
	private List<Split> splits;

	public Expense(double amount, User payee, Date now, List<Split> splits) {
		// this.id = id;
		this.amount = amount;
		this.payee = payee;
		this.createdDate = now;
		this.splits = splits;
	}

//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public User getPayee() {
		return payee;
	}

	public void setPayee(User payee) {
		this.payee = payee;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public List<Split> getSplits() {
		return splits;
	}

	public void setSplits(List<Split> splits) {
		this.splits = splits;
	}

	public abstract boolean validate();

}
