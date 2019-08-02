import java.util.Locale;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// cria um objeto Scanner para receber entrada de dados do usu�rio
		Scanner sc = new Scanner(System.in);
		
		// cria um objeto Account e o atribui a myAccount
		
		Account myAccount = new Account();
		
		// exibe o valor inicial do nome(null)
		System.out.printf("Initial name is: %s%n%n", myAccount);
		
		// solicita e l� o nome
		
		System.out.println("Please enter the name: ");
		String theName = sc.nextLine(); // l� uma linha de texto
		myAccount.setName(theName); // insere theName em myAccount
		System.out.println(); // sa�da em linha em branco
		
		// exibe o nome armazenado no objeto myAccount
		System.out.printf("Name in object myAccount is %s%n%n", myAccount.getName());
		
				
		
		sc.close();

	}

}
