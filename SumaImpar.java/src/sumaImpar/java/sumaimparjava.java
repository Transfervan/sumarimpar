package sumaImpar.java;

import java.util.Scanner;

public class sumaimparjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		//
		int contador = 0;
		int sumar = 0; 
		// variable contador solo aumentara en uno si valor es par
		
		
		System.out.println("Ingrese un número");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// Hara ciclo es decir sumar los impares hasta que numero impar sea menor o igual que el ingresado
		while(i <= n){
			
            if (i % 2 == 0) {
                            
                }
                else {
                	sumar=sumar+i;
                	                	
		}
            
            i+=1;
		
		
	}
		System.out.println(sumar);

}
}
