import java.util.Locale;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	
		// cria um objeto Account e o atribui a myAccount
		
		Account account1 = new Account("Jane Green", 50.00);

		// Exibe saldo inicial de cada objeto
		
		System.out.printf("%s balance: $%.2f %n",
				account1.getName(),account1.getBalance());

		
		// cria um objeto Scanner para receber entrada de dados do usuário
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enten deposit amount for account1: "); // prompt
		double depositAmount = sc.nextDouble(); // obtém a entrada do usuário
		System.out.printf("%nadding %.2f to account1 balance%n%n",
				depositAmount);
		account1.deposit(depositAmount); // adicionada o saldo de account1
		
		//exibe os saldos
		System.out.printf("%s balance: $%.2f %n",
				account1.getName(),account1.getBalance());
		
		/*
		// exibe o valor inicial do nome(null)
		System.out.printf("Initial name is: %s%n%n", myAccount);
		
		// solicita e lê o nome
		
		System.out.println("Please enter the name: ");
		String theName = sc.nextLine(); // lê uma linha de texto
		myAccount.setName(theName); // insere theName em myAccount
		System.out.println(); // saída em linha em branco
		
		// exibe o nome armazenado no objeto myAccount
		System.out.printf("Name in object myAccount is %s%n%n", myAccount.getName());
		
				
		System.out.println("=========================================================");
		
		*/
		
		sc.close();

	}

}
