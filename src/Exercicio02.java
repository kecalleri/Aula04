import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// 02 - Crie um programa que exija que o usu�rio digite a senha 42. Enquanto o usu�rio n�o acertar a senha, deve ser exibida a mensagem "Qual � a resposta para a vida, o universo e tudo mais?"

		Scanner leitor = new Scanner(System.in);
		
		String resposta="";
		
		while(!resposta.equals("42")) {
		System.out.println("Qual � a resposta para a vida, o universo e tudo mais?");
		resposta = leitor.next();	
	}
	
	System.out.println("Voc� acertou! Parab�ns, mochileiro!");
	leitor.close();
	

	}}
