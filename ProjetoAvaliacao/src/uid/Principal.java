package uid;

public class Principal {

	public static void main(String[] args) {
		
		NotaAleatoria n = new NotaAleatoria();
		
		Avaliacao luigi = new Avaliacao(n.notas()[0],n.notas()[1],n.notas()[2]);
		
		System.out.printf("Media luigi aritimetica: %.2f%n" , luigi.mediaAritimetica());
		System.out.printf("Media luigi ponderada: %.2f%n" , luigi.mediaPonderada());
		
	}

};
