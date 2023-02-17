package proyectobank;

public class prueba_metodos {
	public static void main(String[] args) {

		cuenta micuenta = new cuenta();
		micuenta.saldo = 300;
		micuenta.depositar(200);
		
		System.out.println(micuenta.saldo);
	}
}
