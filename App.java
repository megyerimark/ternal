

/*
* File: App.java
* Author: Megyeri MĂˇrk	
* Copyright: 2022, Megyeri MĂˇrk
* Group: Szoft 1/N
* Date: 2022-02-15
* Github: https://github.com/megyerimark/
* Licenc: GNU GPL
*/



import java.util.Scanner;

class App{
	public static void main (String[] args){
		System.out.println("Megyeri Mark , Szoft I N ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Szam: ");
		
		int szam =sc.nextInt();
		String uzenet= (szam >0) ? "Pozitiv" : "Nulla vagy negativ";
		System.out.println("Eredmeny: " + uzenet);
		
		
		}
	}
