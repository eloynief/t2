package t2bol2;

import java.util.Scanner;

public class T2bol24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable para guardar un número entero
		int num1,num2;
				
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
				
		//Le decimos al usuario que introduzca un número
		System.out.print("Escribe un número entre 1 a 6");
		
		//Comando para introducir el primer número
		num1 = sc.nextInt();
		
		//Le decimos al usuario que introduzca un número
		System.out.print("Escribe un número entre 1 a 6");
		
		//Comando para introducir el primer número
		num2 = sc.nextInt();
		
		switch(num1) {
		case 1: 
			System.out.print("Lunes");
		break;
		case 2: 
			System.out.print("Martes");
		break;
		case 3: 
			System.out.print("Miércoles");
		break;
		case 4: 
			System.out.print("Jueves");
		break;
		case 5: 
			System.out.print("Viernes");
		break;
		case 6: 
			System.out.print("Sábado");
		break;
		case 7: 
			System.out.print("Domingo");
		break;
		}
	}

}
