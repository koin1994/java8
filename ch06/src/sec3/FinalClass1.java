package sec3;

public class FinalClass1 {
	final static double PI = 3.14; //멤버상수
	static final int MIN_VALUE = 0;
	static final int MAX_VALUE = 100;
	public static final String CIRCLE_LENGTH = null;
	final static double CIRCLE_LENGTH(){ //항상 같은 결과를 얻는 메서드
		return PI*100;
	}
}
