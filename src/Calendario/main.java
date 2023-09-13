package Calendario;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Ingrese un dia: ");

		Scanner scanner = new Scanner(System.in);

		int dia = scanner.nextInt();

		while (dia <= 0 || dia > 31) {
			System.out.println("Ingrese un dia valido");
			dia = scanner.nextInt();
		}

		System.out.println("Dia ingresado correctamente");

		System.out.println("Ingrese un mes: ");

		int mes = scanner.nextInt();

		while (mes <= 0 || mes > 12) {
			System.out.println("Ingrese un mes valido");
			mes = scanner.nextInt();
		}

		while (mes == 2 && dia > 29) {
			do {
				System.out.println("Ingrese un mes valido");
				mes = scanner.nextInt();

			} while (mes == 2 || mes <= 0 || mes > 12);

		}

		while (mes == 4 && dia > 30) {

			do {

				System.out.println("Ingrese un mes valido");
				mes = scanner.nextInt();
			} while (mes == 4 || mes == 2 || mes == 6 || mes == 9 || mes == 11 || mes <= 0 || mes > 12);

		}

		while (mes == 6 && dia > 30) {

			do {

				System.out.println("Ingrese un mes valido");
				mes = scanner.nextInt();

			} while (mes == 6 || mes == 2 || mes == 4 || mes == 9 || mes == 11 || mes <= 0 || mes > 12);

		}

		while (mes == 9 && dia > 30) {

			do {

				System.out.println("Ingrese un mes valido");
				mes = scanner.nextInt();

			} while (mes == 9 || mes == 11 || mes == 2 || mes == 6 || mes == 4 || mes <= 0 || mes > 12);

		}

		while (mes == 11 & dia > 30) {

			do {
				System.out.println("Ingrese un mes valido");
				mes = scanner.nextInt();

			} while (mes == 11 || mes == 9 || mes == 2 || mes == 6 || mes == 4 || mes <= 0 || mes > 12);

		}

		System.out.println("Mes ingresado correctamente");

		System.out.println("Ingrese un año: ");

		int año = scanner.nextInt();

		while (año < 1900 || año > 2099) {

			System.out.println("Ingrese un año valido");
			año = scanner.nextInt();
		}

		while (mes == 2 && dia == 29) {

			do {
				System.out.println("No es un año biesiesto");
				System.out.println("La fecha ingresada no existe");
				System.out.println("Ingresar un año valido");
				año = scanner.nextInt();

			} while (año % 4 != 0 || año < 1900 || año > 2099);
			break;
		}

		System.out.println("Año ingresado correctamente");

		if (año % 4 == 0) {
			System.out.println("Es un año bisiesto");
		}

		System.out.println("La fecha ingresada es: \nDia" + dia + "\nMes" + mes + "\nAño" + año);

		System.out.println("Fin del programa");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
