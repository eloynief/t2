package t2bol1;

import java.util.Scanner;

public class T2bol14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variable para guardar un número entero
		double num1, num2;
		
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
		
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce un número: ");
		
		//Comando para introducir el primer número
		num1 = sc.nextDouble();
		
		//print que aparece después de escribir el número
		System.out.print("Introduce otro número: ");
		
		//Comando para introducir el segundo número
		num2 = sc.nextDouble();
		
		if(num1>num2)
			System.out.print(num2 + " es menor que " + num1);
		
		else
		
			System.out.print(num1 + " es menor que " + num2);
		
		//cierre de scanner
		sc.close();
	}

}
