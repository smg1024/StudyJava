class Accounting{
	public double valueofSupply;
	public double vatRate;
	public double expenseRate;
	
	public void print() {
		System.out.println("Value of supply : " + valueofSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());	
		System.out.println("Expense : " + getExpense());		
		System.out.println("Income : " + getIncome());		
		System.out.println("Dividend 1 : " + getDividend1());		
		System.out.println("Dividend 2 : " + getDividend2());		
		System.out.println("Dividend 3 : " + getDividend3());
	}

	public double getDividend1() {
		return getIncome() * 0.5;
	}
	
	public double getDividend2() {
		return getIncome() * 0.3;
	}
	
	public double getDividend3() {
		return getIncome() * 0.2;
	}

	public double getIncome() {
		return valueofSupply - getExpense();
	}
	
	public double getExpense() {
		return valueofSupply * expenseRate;
	}

	public double getTotal() {
		return valueofSupply + getVAT();
	}

	public double getVAT() {
		return valueofSupply * vatRate;
	}
}

public class AccountingClassApp {

	public static void main(String[] args) {
		
		Accounting a1 = new Accounting();
		a1.valueofSupply = Double.parseDouble(args[0]);
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueofSupply = Double.parseDouble(args[1]);
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
	}

}
