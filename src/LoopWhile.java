import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
		Scanner leitor = new Scanner(System.in);
		int idade;
		int quantidade;
		int contador=0;
		int total_idades = 0;
		double media;
		System.out.println("Quantos alunos existem na escola?");
		quantidade = leitor.nextInt();
		
		while(contador<quantidade) {
			System.out.println("Por favor, digite a idade do aluno");
			idade = leitor.nextInt();
			contador = contador + 1;
			total_idades = total_idades + idade;			
		}
		media = total_idades / (double)quantidade;
				
		System.out.println("Para as idades digitadas, a m�dia envontrada foi de  " + media);
		leitor.close();
	}

}
