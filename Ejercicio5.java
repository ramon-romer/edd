package ejercicioTema2;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Realizar un programa que muestre la suma de todos los números del 1 al 10000.
		// Es decir: 1 + 2 + 3 + 4 + 5 + … + 9999 + 10000
		
		
		Integer suma = 0;
		Integer num1 = 1;
		while (num1 < 10000) {
			System.out.println(num1);
			suma += num1; // --> suma = suma + num1
			num1++; // --> num1 = num1 + 1
		}
		System.out.println("La suma es " + suma);
		
	}

}
