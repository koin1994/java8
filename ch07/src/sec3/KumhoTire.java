package sec3;

public class KumhoTire extends Tire{
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location + "KumhoTire 수명: "+(maxRotation+accmulatedRotation));
			return true;
		} else {
			System.out.println("**** "+location+" KumhoTire 펑크*****");
			return false;
		}
	}
}
