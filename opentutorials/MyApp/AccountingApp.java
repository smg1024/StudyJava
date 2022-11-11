
public class AccountingApp {
	
	public static double ValueofSupply = 10000.0;
	
	public static double vatRate = 0.1;
	
	public static double expenseRate = 0.3;
	
	public static double getVAT() {
		return ValueofSupply * vatRate;
	}
	
	public static double getTotal() {
		return ValueofSupply + getVAT();
	}
	
	public static double getExpense() {
		return ValueofSupply * expenseRate;
	}
	
	public static double getIncome() {
		return ValueofSupply - getExpense();
	}

	public static void main(String[] args) {
		
		// 가격 *****원, 부가세 10%
		//double ValueofSupply = Double.parseDouble(args[0]);
		//double vatRate = 0.1;
		//double expenseRate = 0.3;
		//double vat = ValueofSupply * vatRate;
		//double expense = ValueofSupply * expenseRate;
		//double income = ValueofSupply - getExpense();
		double dividend1 = getIncome() * 0.5;
		double dividend2 = getIncome() * 0.3;
		double dividend3 = getIncome() * 0.2;
		
		System.out.println("Value of supply : " + ValueofSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());	
		System.out.println("Expense : " + getExpense());		
		System.out.println("Income : " + getIncome());		
		System.out.println("Dividend 1 : " + dividend1);		
		System.out.println("Dividend 2 : " + dividend2);		
		System.out.println("Dividend 3 : " + dividend3);

	}

}
