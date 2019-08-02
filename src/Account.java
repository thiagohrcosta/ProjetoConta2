
public class Account {
	
	private String name; // variável da instância
	private double balance; // variável da instância
	
	// Construtor do Account que recebe dois parâmetros
	
	public Account(String name, double balance) {
		this.name = name; // atribui name à variável de instância name
		
		// valida que o balance é maior que 0.0; se não for,
		// a variável de instância balance mantém seu valor inicial padrão de 0.0
		
		if(balance > 0.0) // se o saldo for válido
			this.balance = balance; // atribui à variável de instância balance
	}
	
	// método que deposita (adiciona) apenas uma quantia válida no saldo
	
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) // se o depositAmount form válido
			balance = balance + depositAmount; // adiciona ao saldo
	}
	
	// método retorna o saldo da conta
	
	public double getBalance() {
		return balance;
	}
	
	// método para definir o nome no objeto
	
	public void setName(String name) {
		this.name = name; // armazena o nome
	}
	
	// método para recuperar o nome do objeto
	
	public String getName() {
		return name; // retorna o valor do nome para o chamador
	}
	
	// fim da classe Account

}
