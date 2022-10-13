package t2bol2;

import java.util.Scanner;

public class T2bol23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable para guardar un número entero
		int num1,num2;
		String opcion;
				
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
				
		//Le decimos al usuario que introduzca un número
		System.out.print("Escribe el primer número");
		
		//Comando para introducir el primer número
		num1 = sc.nextInt();
		
		//Le decimos al usuario que introduzca un número
		System.out.print("Escribe el segundo número");
		
		//Comando para introducir el segundo número
		num2 = sc.nextInt();
		
		//Le decimos al usuario que introduzca un número
		System.out.println("a. Sumar");
		System.out.println("b. Restar");
		System.out.println("c. Multiplicar");
		System.out.println("d. Dividir");
		//Comando para introducir el segundo número
		opcion = sc.next();
		switch(opcion) {
		
		//si es este caso, se imprime la suma entre los números
		case "a": 
			System.out.print(num1+num2);
		break;
		
		//si es este caso, se imprime la resta entre los números
		case "b": 
			System.out.print(num1-num2);
		break;
		
		//si es este caso, se imprime la multiplicación entre los números
		case "c": 
			System.out.print(num1*num2);
		break;
		
		//si es este caso, se imprime la división entre los números
		case "d": 
			System.out.print(num1/num2);
		break;
		
		default: 
			System.out.print("La opción introducida es errónea");
		break;
		}
	}

}
