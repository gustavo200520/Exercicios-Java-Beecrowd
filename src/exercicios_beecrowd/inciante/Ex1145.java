package exercicios_beecrowd.inciante;
import java.util.Scanner;
import java.io.IOException;
public class Ex1145 {
	public static void main(String[] args) throws IOException{
		Scanner teclado = new Scanner(System.in);
		int numero, sequencia;
		sequencia = teclado.nextInt();
		numero = teclado.nextInt();
		
		if(sequencia>1 && sequencia<20 && numero>sequencia && numero<100000) {
			for(int cont=1;cont<=numero;cont++) {
				if(cont%sequencia==0) {
					System.out.println(cont);
				}
				else {
					System.out.print(cont + " ");
				}
			}

		}
	}
}
