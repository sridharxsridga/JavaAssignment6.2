/*
 * This class is to implement bank application with three BankAtm objects.
 *  using which deposit and withdrawal is done 
 */

package exceptionHandling;

public class TestBankAtm {

	public static void main(String[] args) {
		
		BankAtm atm1 = new BankAtm("sr262760","Citi","Yelahanka",40000.00); //object1
		BankAtm atm2 = new BankAtm("an262715","HDFC","Yelahanka",35000.00); //object2
		BankAtm atm3 = new BankAtm("pr262760","SBI","Yelahanka",20000.00);//object3
		try {
			atm1.withdraw(45000.00);   // Amount to be withdrawn is greater than the balance using object1
			
		} catch (BankAtmException e) {
		
			e.printStackTrace(); //prints this throwable and its backtrace to the standard error stream
		}
		
	
		try {
			atm2.withdraw(30000.00); // withdrawing amount making Balance less 10000 limit using object 2
		} catch (BankAtmException e) {
		
			e.printStackTrace();//prints this throwable and its backtrace to the standard error stream
		}
		
		atm3.deposit(20000.00); //Depositing amount using object3
		

		try {
			atm3.withdraw(20000.00);  //Withdrawing amount lesser than balance using object3
		} catch (BankAtmException e) {
		
			e.printStackTrace();//prints this throwable and its backtrace to the standard error stream
		}
		
	}

}
