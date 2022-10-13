package t2bol2;

import java.util.Scanner;

public class T2bol24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable para guardar un número entero
		String num1,num2;
		int dado1=0,dado2=0;
				
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
				
		//Le decimos al usuario que introduzca un número
		System.out.print("Escribe un número entre 1 a 6");
		
		//Comando para introducir el primer número
		num1 = sc.next();
		
		//Le decimos al usuario que introduzca un número
		System.out.print("Escribe un número entre 1 a 6");
		
		//Comando para introducir el primer número
		num2 = sc.next();
		
		switch(num1) {
		case "UNO": 
			dado1=1;
		break;
		case "DOS": 
			dado1=2;
		break;
		case "TRES": 
			dado1=3;
		break;
		case "CUATRO": 
			dado1=4;
		break;
		case "CINCO": 
			dado1=5;
		break;
		case "SEIS": 
			dado1=6;
		break;
		default:
			System.out.println("No se ha introducido ningún valor válido");
		break;
		}
		
		switch(num2) {
		case "UNO": 
			dado2=1;
		break;
		case "DOS": 
			dado2=2;
		break;
		case "TRES": 
			dado2=3;
		break;
		case "CUATRO": 
			dado2=4;
		break;
		case "CINCO": 
			dado2=5;
		break;
		case "SEIS": 
			dado2=6;
		break;
		default:
			System.out.println("No se ha introducido ningún valor válido");
		break;
		}
		
		if(dado1>0 && dado2>0) {
		System.out.print("La suma de los dos dados es: ");
		System.out.print(dado1+dado2);
		}
	}

}
