
public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Primeira Conta: " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Primeira Conta: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.agencia = 146;
		segundaConta.saldo = 50;
		System.out.println("Segunda Conta: " + segundaConta.saldo);
	
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
	}
}
