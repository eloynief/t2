package t2bol1;

import java.util.Scanner;

public class T2bol19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable para guardar un número entero
		int j1,j2,piedra,papel,tijeras;
				
		piedra = 1;
		papel = 2;
		tijeras = 3;
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
		
		//
		System.out.print("Introduce piedra (1), papel (2)o tijeras(3): ");
		j1 = sc.nextInt();
		
		//
		System.out.print("Introduce piedra (1), papel (2)o tijeras(3): ");
		j2 = sc.nextInt();
		
		if(j1<1 || j1>3){
			
			System.out.print("No válido");
			
		}
		else if(j2<1 || j2>3) {
			
			System.out.print("No válido");
			
		}
		else if(j1==j2) {
			System.out.print("Empate");
		}
		else if (j1==piedra && j2==papel || j1==papel && j2==tijeras || j1==tijeras && j2==piedra) {
			
			System.out.print("Gana j2");
		}
		else {
			System.out.print("Gana j1");
		}
	}

}
