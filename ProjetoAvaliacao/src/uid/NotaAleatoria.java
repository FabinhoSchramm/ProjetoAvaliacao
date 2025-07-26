package uid;

public class NotaAleatoria {
	
	float max = 10;
	float min = 0;
	float range = max - min + 1;
	
	public double[] notas() {
		
		double[] n = new double[3];
		
		for (int i=0; i < 3; i++) {
			double rand = Math.random() * range + min;
			n[i] = rand;
		}
		
		return n;
	}
}
