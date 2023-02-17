package proyectobank;

public class prueba_metodos {
	public static void main(String[] args) {

		cuenta micuenta = new cuenta();
		micuenta.saldo = 300;
		micuenta.depositar(200);
		System.out.println(micuenta.saldo);
		micuenta.retirar(100);
		System.out.println(micuenta.saldo + " saldo de mi cuenta despues de retirar ");

		cuenta cuentadejimena = new cuenta();
		cuentadejimena.depositar(2000);
		cuentadejimena.transferir(400, micuenta);
		System.out.println(cuentadejimena.saldo+" saldo de jimena");
		System.out.println(micuenta.saldo + " saldo de mi cuenta despues de deposito");
	}
}
