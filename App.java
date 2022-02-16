import java.util.Scanner;

class App{
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Szam: ");
		
		int szam =sc.nextInt();
		String uzenet= (szam >0) ? "Pozitiv" : "Nulla vagy negativ";
		System.out.println("Eredmeny: " + uzenet);
		
		
		}
	}
