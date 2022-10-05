package t2bol1;

import java.util.Scanner;

public class T2bol11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable para guardar un número entero
		int num;
		
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
		
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce un número: ");
		
		////Comando para introducir el número
		num = sc.nextInt();
		
		//comando if que funciona solo si ocurre lo que tiene escrito
		if(num%2 == 0)
		
		//si lo introducido es verdad, se activa este comando
		System.out.print("Es par");
		
		//si el "if" no se activa porque no es verdad, se activa else
		else
			
		//si el if no se activa, entonces el else activa sus comandos
		System.out.print("es impar");
		
		//cierre de scanner
		sc.close();
	}

}
