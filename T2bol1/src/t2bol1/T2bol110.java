package t2bol1;

import java.util.Scanner;

public class T2bol110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable para guardar un número entero
		int num1,num2,num3;
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
		
		
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce el primer número: ");
				
		//Comando para introducir el primer número
		num1 = sc.nextInt();
				
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce el segundo número: ");
						
		//Comando para introducir el segundo número
		num2 = sc.nextInt();
		
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce el tercer número: ");
						
		//Comando para introducir el tercer número
		num3 = sc.nextInt();
		
		//comando if que nos mostrará algo
		if(num1+num2==num3) {
			
			System.out.print("la suma de num1 y num2 es num3");
				
		}
		
		else if(num1+num3==num2) {
			System.out.print("la suma de num1 y num3 es num2");
		}
		
		else if(num2+num3==num1) {
			System.out.print("la suma de num2 y num3 es num1");
		}
		
		else{
			System.out.print("ningún numero al sumar con otro da el siguiente");
		}
	}
	

}
