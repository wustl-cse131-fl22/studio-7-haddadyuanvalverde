package studio7;

public class Die {
	
	private int n;
	
	public Die(int n) {
		this.n = n;
	}
	public int dieRoll() {
		return (int)((Math.random()*n) + 1);
	}
}
