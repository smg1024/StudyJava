
public class AccountingIfUnder10000App {

	public static void main(String[] args) {
		
		// 가격 *****원, 부가세 10%
		double ValueofSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = ValueofSupply * vatRate;
		double total = ValueofSupply + vat;
		double expense = ValueofSupply * expenseRate;
		double income = ValueofSupply - expense;
		double dividend1 = income * 1;
		double dividend2 = income * 0;
		double dividend3 = income * 0;
		
		System.out.println("Value of supply : " + ValueofSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);	
		System.out.println("Expense : " + expense);		
		System.out.println("Income : " + income);		
		System.out.println("Dividend 1 : " + dividend1);		
		System.out.println("Dividend 2 : " + dividend2);		
		System.out.println("Dividend 3 : " + dividend3);

	}

}
