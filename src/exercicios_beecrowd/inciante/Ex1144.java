package exercicios_beecrowd.inciante;
import java.util.Scanner;
import java.io.IOException;
//Lembrar que no beecrowd a classe deve ser Main e nao pode ter o package
public class Ex1144 {
	public static void main(String args[]) throws IOException{
		Scanner teclado = new Scanner(System.in);
		int numero, n1=1,n2=1,n3=1, j2,j3;
		numero = teclado.nextInt();
		
		for(int cont=0;cont<numero*2;cont+=2) {
			System.out.printf("%d %d %d\n",n1, n2, n3);
			j2=n2+1;
			j3=n3+1;
			System.out.printf("%d %d %d\n",n1, j2, j3);
			n1++;
			n2=n1*n1;
			n3=n2*n1;
		}
	}
}
