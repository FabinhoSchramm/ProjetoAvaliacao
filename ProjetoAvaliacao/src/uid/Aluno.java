package uid;

public class Aluno {

	String nome,curso;
	
	Avaliacao notas;
	
	Aluno(){
		
	}
	
	Aluno(String nome, String curso) {
		this.nome = nome;
		this.curso = curso; 
	}
	
	void info() {
		System.out.println("Nome: " + nome);
		System.out.println("Curso: " + curso);
		System.out.printf("Avaliacao 1: %.2f%nAvaliacao 2: %.2f%nAvaliacao 3: %.2f%n" , notas.n1, notas.n2, notas.n3);
		System.out.printf("Media Aritimetica: %.2f%nMedia Ponderada: %.2f", notas.mediaAritimetica(), notas.mediaPonderada());
	}
}
