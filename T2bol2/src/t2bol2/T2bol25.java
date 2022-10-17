package t2bol2;

import java.util.Scanner;

public class T2bol25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable para guardar un número entero
		String caracteres;
				
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
				
		//Le decimos al usuario que introduzca un número
		System.out.print("Escribe un número entre 1 a 7");
		
		//Comando para introducir el primer número
		caracteres = sc.next();
		
		switch(caracteres) {
		case "E": 
			System.out.print("Pertenece a remolques");
		break;
		case "D":
			System.out.print("Pertenece a autobuses");
		break;
		case "C1","C2","C3","C4","C5":
			System.out.print("Pertenece a camiones");
			break;
		case "A":
			System.out.print("Pertenece a motocicletas");
		break;
		case "B1","B2":
			System.out.print("Pertenece a automóviles");
		break;
		default:
			System.out.print("Categoría no contemplada");
		break;
		}
	}

}
