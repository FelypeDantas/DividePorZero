package br.com.erros;

import java.util.InputMismatchException;
import java.util.Scanner;
public class DividePorZero {
   public static void main (String args []) {
	   
	   Scanner s = new Scanner(System.in);
	   boolean continuar = true;
	 
   do {
	 try {
	     System.out.println("Número: ");
	   
	     int a = s.nextInt();
	     System.out.println("Divisor: ");
	   
	     int b = s.nextInt();
	     System.out.println(a / b);
	 }
	 catch (InputMismatchException e1) {
		 System.err.println("Insira números inteiros !");
	 }
	 catch(Throwable e2) {
		 System.err.println("o divisor deve ser diferente de zero !");
	 }
	 finally {
		 System.out.println("Finally executado ...");
	 }
   }while(continuar);
   }
   
}
