package t2bol1;

import java.util.Scanner;

public class T2bol12 {

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
		
		//comando if que funciona solo si ocurre lo que tiene escrito
		if(num1 == num2)
		
		//lo que aparece si ocurre lo escrito en el "if"
		System.out.print("Son iguales");

		//si el "if" no se activa porque no es verdad, se activa el else
		else
		
		//lo que aparece si no ocurre lo que se ha escrito en el if
		System.out.print("no son iguales");
		
		//cierre de scanner
		sc.close();
	}

}
