package exercicios_beecrowd.inciante;
import java.util.Scanner;
import java.io.IOException;
//Lembrar que no beecrowd a classe deve ser Main e nao pode ter o package
public class Ex1564 {
	public static void main(String args[]) throws IOException{
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		while (teclado.hasNext()) {
		    numero = teclado.nextInt();
		    
		    if (numero == 0) {
		        System.out.println("vai ter copa!");
		    } 
		    else {
		        System.out.println("vai ter duas!");
		    }
		}
	}
}