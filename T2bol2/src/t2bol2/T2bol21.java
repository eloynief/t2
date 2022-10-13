package t2bol2;

import java.util.Scanner;

public class T2bol21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable para guardar un número entero
		int num;
				
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
				
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce la nota del alumno: ");
		
		//Comando para introducir el primer número
		num = sc.nextInt();
		
		switch(num) {
		case 0,1,2,3,4: 
			System.out.print("Insuficiente");
		break;
		case 5:
			System.out.print("Suficiente");
		break;
		case 6:
			System.out.print("Bien");
			break;
		case 7,8:
			System.out.print("Notable");
		break;
		case 9,10:
			System.out.print("Sobresaliente");
		break;
		}
	}

}
