package proyectobank;

public class cuenta {

	double saldo;
	int agencia;
	int numero;
	String titular;

	void depositar(double valor) {
		saldo = saldo + valor;
	}

}
