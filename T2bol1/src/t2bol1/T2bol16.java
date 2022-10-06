package t2bol1;

import java.util.Scanner;

public class T2bol16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable para guardar un número entero
		double a, b, c, xsum, xres, raiz;
				
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
				
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce el primer número: ");
		
		//Comando para introducir el primer número
		a = sc.nextDouble();
		
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce el segundo número: ");
				
		//Comando para introducir el primer número
		b = sc.nextDouble();
		
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce el tercer número: ");
						
		//Comando para introducir el primer número
		c = sc.nextDouble();
		
		raiz = ((b*b) - 4*a*c);
		xsum=(-b + Math.sqrt(raiz))/2*a;
		xres=(-b - Math.sqrt(raiz))/2*a;
		
		if(raiz>=0) {
			System.out.print("Los valores de X son: " + " " + xsum + " " + xres);
		}
		else {
			System.out.print("La ecuación no posee solución");
		}
	}

}
