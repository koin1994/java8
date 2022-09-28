package sec3;

public class HankookTire extends Tire{
	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location + "HankookTire 수명: "+(maxRotation+accmulatedRotation));
			return true;
		} else {
			System.out.println("**** "+location+" HankookTire 펑크*****");
			return false;
		}
	}
}
