package exercicios_beecrowd.inciante;
import java.util.Scanner;
import java.io.IOException;
//Lembrar que no beecrowd a classe deve ser Main e nao pode ter o package
public class Ex1070 {
	public static void main(String[] args) throws IOException{
		Scanner teclado = new Scanner(System.in);
		int numero, contador_impar=0;
		numero = teclado.nextInt();
		
		do {
			if(numero%2!=0) {
				System.out.println(numero);
				contador_impar++;
			}
			numero++;
		}while(contador_impar<6);
	}
}
