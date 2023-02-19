package proyectobank;

public class prueba_metodos {
	public static void main(String[] args) {

		cuenta micuenta = new cuenta();
		micuenta.setSaldo(300);
		micuenta.depositar(200);
		System.out.println(micuenta.getSaldo());
		micuenta.retirar(100);
		System.out.println(micuenta.getSaldo() + " saldo de mi cuenta despues de retirar ");

		cuenta cuentadejimena = new cuenta();
		cuentadejimena.depositar(2000);
		cuentadejimena.transferir(400, micuenta);
		System.out.println(cuentadejimena.getSaldo()+" saldo de jimena");
		System.out.println(micuenta.getSaldo() + " saldo de mi cuenta despues de deposito");
		
		cliente Diego = new cliente();
		
		Diego.nombre = "Diego r";
		Diego.documento = "123456789";
		Diego.telefono = "34157892";
		
		cuenta cuentadediego = new cuenta();
		cuentadediego.setAgencia(1);
		cuentadediego.titular = Diego;
		
		System.out.println(cuentadediego.titular.documento);
		
	}
}
