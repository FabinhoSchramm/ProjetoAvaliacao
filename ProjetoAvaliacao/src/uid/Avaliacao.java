package uid;

public class Avaliacao {
	
	double n1,n2,n3;
	
	NotaAleatoria n = new NotaAleatoria();

	Avaliacao() {
		this.n1 = n.notas()[0];
		this.n2 = n.notas()[1];
		this.n3 = n.notas()[2];
	}


	public double mediaAritimetica() {
		return (n1+n2+n3)/3;
	}
	
	public double mediaPonderada() {
		return (n1*2 + n2*3 + n3*4) / 9; 
	}

}
