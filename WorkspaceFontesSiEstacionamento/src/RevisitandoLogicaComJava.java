package aula2;
import java.util.Scanner;
public class RevisitandoLogicaComJava {

	public static void main(String[] args) {
		// cntrl+shift+f - identa o programa
		
		/*
		a.exibir os numeros pares de 100 a 0.
		b.exibir a soma dos numeros de 0 a 100.
		c.verificar o peso de tres metais e informar o mais pesado.
		d.exibir os numeros de 0 a 100, exceto o intervalo de 50 a 75.
		 */
		
		//numerosPares();
		//numerosSoma();
		//pesoMetais();
		numerosMenos();
	}
	
	// a
	public static void numerosPares(){
		for (int i = 100; i > 0; i = i - 2){
			System.out.println(i);
		}
	}
	
	// b
	
	public static void numerosSoma(){
		int soma = 0;
		int i = 0;
		while (i <= 100){
			soma = soma + i;
			i++;
		}
		//for (int i = 0; i <= 100; i = i + 1){
			//soma = soma + i;
		//}
		System.out.println(soma);
	}
	
	// c
	
	public static void pesoMetais(){
		float a, b, c, maior = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o peso do ouro: ");
		a = teclado.nextFloat();
		System.out.println("Informe o peso da prata: ");
		b = teclado.nextFloat();
		System.out.println("Informe o peso do bronze: ");
		c = teclado.nextFloat();
		
		if (a > b && a > c)
			maior = a;
		if (b > a && b > c)
			maior = b;
		else
			maior = c;
		System.out.println(maior);
		teclado.close();
	}
	
	// d
	
	public static void numerosMenos(){
		for(int i = 0; i <= 100; i++){
			if (i >= 50 && i <= 75){
				continue;
			}
			System.out.println(i);
		}
	}
	
}
