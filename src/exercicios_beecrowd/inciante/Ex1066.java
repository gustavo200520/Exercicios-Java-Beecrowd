package exercicios_beecrowd.inciante;
import java.io.IOException;
import java.util.Scanner;
//Lembrar que no beecrowd a classe deve ser Main e nao pode ter o package
public class Ex1066 { 
	    public static void main(String[] args) throws IOException{
	    	Scanner teclado = new Scanner(System.in);
	    	int [] numero = new int[5];
	    	int cont_par=0, cont_impar=0, cont_positivo=0, cont_negativo=0;
	    	
	    	for(int cont=0;cont<5;cont++) {
	    		numero[cont] = teclado.nextInt();
	    	}
	    	
	    	for(int cont=0;cont<5;cont++) {
	    			if(numero[cont]%2==0) {
	    				cont_par++;
	    			}
	    			else cont_impar++;
	    			
	    		if(numero[cont]!=0) {
	    			if(numero[cont]>0) {
	    				cont_positivo++;
	    			}
	    			else cont_negativo++;
	    		}
	    	}
	    	
	    	System.out.printf("%d valor(es) par(es)\n", cont_par);
	    	System.out.printf("%d valor(es) impar(es)\n", cont_impar);
	    	System.out.printf("%d valor(es) positivo(s)\n", cont_positivo);
	    	System.out.printf("%d valor(es) negativo(s)\n", cont_negativo);
	    }
	 
	}