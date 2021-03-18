package ro.ase.csie.cts.seminar4;

import java.math.BigInteger;
import java.util.Random;

import ro.ase.csie.cts.seminar4.banking.Bank;
import ro.ase.csie.cts.seminar4.banking.BankAccount;
import ro.ase.csie.cts.seminar4.banking.CreditBankAccount;
import ro.ase.csie.cts.seminar4.banking.DebitBankAccount;
import ro.ase.csie.cts.seminar4.banking.EmailNotificationService;
import ro.ase.csie.cts.seminar4.banking.InsuficientFundsException;
import ro.ase.csie.cts.seminar4.banking.NotificationService;
import ro.ase.csie.cts.seminar4.banking.Person;
import ro.ase.csie.cts.seminar4.singleton.Elvis;

public class Main {

	public static void main(String[] args) {
		NotificationService emailService = new EmailNotificationService();

		Person p3 = new Person("Van Damme");
		p3.setEmail("van@damme.com");
		p3.setMobile("+8766764453551");
		
		DebitBankAccount b3 = new DebitBankAccount(emailService, "BT12312314", p3);
		
		CreditBankAccount b = CreditBankAccount.createCreditBankAccountWithBalance(emailService, "INGB23544353", p3, 100);
		
		CreditBankAccount b1 = CreditBankAccount.createCreditBankAccount(emailService, "RFZ2343565", p3);
		
		BigInteger bi = new BigInteger(24, 11, new Random());
		BigInteger bi2 = BigInteger.probablePrime(12, new Random());
				
		Boolean value = Boolean.valueOf(false);
		
		b.deposit(50);
		
		System.out.println(b.toString());
		
		Elvis elvis = Elvis.getInstance();
		elvis.sing();
		Elvis elvis2 = Elvis.getInstance();
		System.out.println(elvis == elvis2); 
		
		ElvisV2 elvisV2 = ElvisV2.INSTANCE;
		elvisV2.sing();
		
		Person adult = new Person("Van Damme");
		adult.setEmail("van@damme.com");
		adult.setMobile("+8766764453551");
		adult.setAge(30);
		adult.setNotificationType(Person.NotificationType.EMAIL);
		
		Person child = new Person("Van Damme Jr");
		child.setEmail("vanjr@damme.com");
		child.setMobile("+8766764453551");
		child.setAge(14);
		child.setNotificationType(Person.NotificationType.SMS);
		
		Bank bank = Bank.getInstance();
		DebitBankAccount debit1 = bank.openDebitAccount(adult);
		DebitBankAccount debit2 = bank.openDebitAccount(child);

		
		debit1.deposit(20);
		debit2.deposit(5);
		try {
			debit1.withdraw(15);
			debit2.withdraw(3);
		}
		catch (InsuficientFundsException ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println(debit1);
		System.out.println(debit2);
		
	}

}
