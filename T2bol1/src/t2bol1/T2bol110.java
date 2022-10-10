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
		
		if(num1+num2==num3) {
			
			System.out.print("a");
				
		}
		
		else if(num1+num3==num2) {
			System.out.print("b");
		}
		
		else if(num2+num3==num1) {
			System.out.print("c");
		}
	}
	

}
