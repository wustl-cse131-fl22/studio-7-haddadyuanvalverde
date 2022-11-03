package studio7;

public class Fraction {
	
	private int nom, den;
	
	public Fraction(int n, int d) {
		nom =n;
		den = d;
	}
	
	public int getNom() {
		return nom;
	}
	
	public int getDen() {
		return den;
	}
	
	public Fraction add(Fraction other) {
		double cd = gcd(other.getDen(),this.getDen());
		double tdr = cd/this.getDen();
		double odr = cd/other.getDen();
				
		double nNom = this.getNom()*tdr+ other.getNom()*odr;
		
		return new Fraction(nNom,cd);
	}
	
	public static int gcd(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}
	
	public String toString() {
		return nom+"/"+den;
	}

}
