package t2bol1;

import java.util.Scanner;

public class T2bol17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable para guardar un número entero
		int num;
				
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
				
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce el primer número: ");
		
		//Comando para introducir el primer número
		num = sc.nextInt();
		
		if(num>=0 || num<10) {
			System.out.print("tiene 1 cifra");
		}
		else if(num>=10 || num<100) {
			System.out.print("tiene 2 cifras");
		}
		else if(num>=100 || num<1000) {
			System.out.print("tiene 3 cifras");
		}
		else if(num>=1000 || num<10000) {
			System.out.print("tiene 4 cifras");
		}
		else if(num>=10000 || num<100000) {
			System.out.print("tiene 5 cifras");
		}
		else
			System.out.print("tiene más de 5 cifras");
	}

}
