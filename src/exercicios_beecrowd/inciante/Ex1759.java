package exercicios_beecrowd.inciante;
import java.util.Scanner;
import java.io.IOException;
//Lembrar que no beecrowd a classe deve ser Main e nao pode ter o package
public class Ex1759 {
	public static void main(String args[]) throws IOException{
		Scanner teclado = new Scanner(System.in);
		int numero=teclado.nextInt();
		
		for(int cont=1;cont<=numero;cont++) {
			if(cont<numero) {
				System.out.printf("Ho ");
			}
			
			else{
				System.out.println("Ho!");
			}
		}
	}
}