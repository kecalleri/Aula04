import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		//03 - Crie um programa capaz de calcular a tabuada de um número digitado pelo usuário.
		
		Scanner leitor = new Scanner(System.in);
		int n, res;
		int contador = 1;
		System.out.println("Você quer calcular a tabuada de qual número?");
		n = leitor.nextInt();
		
		while(contador <= 10) {
		res = n * contador;
		System.out.println(n + " x " + contador + " = " + res);
		contador = contador + 1;	
		}	
		leitor.close();
		
	}

}
