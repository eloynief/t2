package t2bol1;

import java.util.Scanner;

public class T2bol15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variable para guardar un número entero
		double num1, num2, num3;
				
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
				
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce el primer número: ");
		
		//Comando para introducir el primer número
		num1 = sc.nextDouble();
		
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce el segundo número: ");
				
		//Comando para introducir el primer número
		num2 = sc.nextDouble();
		
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce el tercer número: ");
						
		//Comando para introducir el primer número
		num3 = sc.nextDouble();
		
		if(num3<num2 && num2<num1){
		System.out.print(num1 + " " + num2 + " " + num3);
		}
		
		//comando else if el cual hace su función si if no la hace y si es verdad lo escrito
		else if(num2<num3 && num3<num1){
		
		System.out.print(num1 + " " + num3 + " " + num2);	
		}
		
		//repetición del comando else if con los otros valores si el else if no hace su función
		//si num2<num1<num3, se activa esta función
		else if(num2<num1 && num1<num3){
		System.out.print(num3 + " " + num1 + " " + num2);
		}
		
		//repetición del comando else if con los otros valores si los demás else if no hacen su función
		//si num1<num2<num3, se activa esta función
		else if(num1<num2 && num2<num3){
		System.out.print(num3 + " " + num2 + " " + num1);
		}
		
		else if(num1<num3 && num3<num2){
		System.out.print(num2 + " " + num3 + " " + num1);
		}
		
		else{
		System.out.print(num2 + " " + num1 + " " + num3);
		}
		
		//cierre de scanner
		sc.close();
	}

}
