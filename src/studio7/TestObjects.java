package studio7;

public class TestObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle(2,3);
		Rectangle r1 = new Rectangle(9,10);
		Rectangle r2 = new Rectangle(5,5);
		r.setLength(20);
		Die d = new Die(6);
		Fraction f = new Fraction(4,7);
		Fraction f1 = new Fraction (1,2);
		
		System.out.println(f.add(f1));
		
		
		
		System.out.println(d.dieRoll());

	}

}
