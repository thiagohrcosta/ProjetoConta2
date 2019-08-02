
public class Account {
	
	private String name; // vari�vel da inst�ncia
	private double balance; // vari�vel da inst�ncia
	
	// Construtor do Account que recebe dois par�metros
	
	public Account(String name, double balance) {
		this.name = name; // atribui name � vari�vel de inst�ncia name
		
		// valida que o balance � maior que 0.0; se n�o for,
		// a vari�vel de inst�ncia balance mant�m seu valor inicial padr�o de 0.0
		
		if(balance > 0.0) // se o saldo for v�lido
			this.balance = balance; // atribui � vari�vel de inst�ncia balance
	}
	
	// m�todo que deposita (adiciona) apenas uma quantia v�lida no saldo
	
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) // se o depositAmount form v�lido
			balance = balance + depositAmount; // adiciona ao saldo
	}
	
	// m�todo retorna o saldo da conta
	
	public double getBalance() {
		return balance;
	}
	
	// m�todo para definir o nome no objeto
	
	public void setName(String name) {
		this.name = name; // armazena o nome
	}
	
	// m�todo para recuperar o nome do objeto
	
	public String getName() {
		return name; // retorna o valor do nome para o chamador
	}
	
	// fim da classe Account

}
