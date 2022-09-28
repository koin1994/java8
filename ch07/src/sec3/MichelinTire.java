package sec3;

public class MichelinTire extends Tire{
	public MichelinTire(int maxRotation, String location) {
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location + "MichelinTire 수명: "+(maxRotation+accmulatedRotation));
			return true;
		} else {
			System.out.println("**** "+location+" MichelinTire 펑크*****");
			return false;
		}
	}
}