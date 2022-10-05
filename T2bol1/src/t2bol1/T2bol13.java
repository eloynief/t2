package t2bol1;

import java.util.Scanner;

public class T2bol13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variable para guardar un número entero
		double num1;
		
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
		
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce un número: ");
		
		//comando para introducir el valor del num
		num1 = sc.nextDouble();
		
		/*comando if que dice que ocurre algo si
		el num1 es mayor a -1, menor a 1 y distinto de 0*/
		if(num1<1 && num1>-1 && num1!=0)
		
		//si el if es cierto, se activa este comando de print
		System.out.print("Es casi 0");
		
		//si el "if" no se activa porque no es verdad, se activa el else
		else
			
		//si no es cierto, se activa esta otra cosa
		System.out.print("No es casi 0");
		
		//cierre de scanner
		sc.close();
	}

}
