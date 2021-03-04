package ro.ase.csie.cts.seminar2;

import java.math.BigDecimal;

import ro.ase.csie.cts.seminar2.solid.BankAccount;
import ro.ase.csie.cts.seminar2.solid.FeeBankAcocunt;
import ro.ase.csie.cts.seminar2.solid.InsuficientFundsException;
import ro.ase.csie.cts.seminar2.solid.Person;

public class Main {

	public static void main(String[] args) {
		
//		double d1 = 1.02;
//		double d2 = 0.43; 
//		BigDecimal bg1 = new BigDecimal("1.02"); //varianta preferata, mai precis decat double
//		BigDecimal bg2 = new BigDecimal("0.43");
//		System.out.println(bg1.subtract(bg2));
//		System.out.println(d1-d2);
		
//		CalendarUtil cu = new CalendarUtil();
//		try {
//			System.out.println(cu.weekDay(3).toUpperCase());
//			System.out.println(cu.weekDay2(3));//cu switch
//			System.out.println(cu.weekDay3(3));//cu vector
//			System.out.println(cu.weekDay4(3)); //new DateFormat
//		} catch (IcorectDayException e) {
//			System.out.println(e.getMessage());
//		}

		Person p = new Person("Diana");
		BankAccount account = new BankAccount("ING32942774", p);
		
		account.deposit(100);
		try {
			account.withdraw(30);
			account.withdraw(40);
			account.withdraw(70);
		} catch (InsuficientFundsException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(account.getBalance());
		
		FeeBankAcocunt fb = new FeeBankAcocunt("ING977347578", p);
		
		fb.deposit(500);
		try {
			fb.withdraw(100);
		}catch (InsuficientFundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(fb.getBalance());
		
	}
}
