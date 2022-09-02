package sec2;

public class Cast2 {
	public static void main(String[] args) {
		int a=100, b=23; c;
		float d, e, f;
		c = a / b;    //4 -> 자동 형 변환
		System.out.println("c="+c);
		d= (float) a / b;  //4.0 -> 강제 형 변환
		System.out.println("d="+d);
		e = 500 / 3.0;     //3 -> 3.0f로 형 변환 연산
		System.out.println('e='+e);
		System.out.println(Byte.Min_value+"~"+Byte.max_value);
		System.out.println("short :" +Short.Min_value+"~"+Short.max_value);
		System.out.println("int : "+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println("long : "+Long.Min_value+"~"+Long.MAX_VALUE);
		System.out.println("float :" +Float.min_value+"~"+Float.max_value);
		System.out.println("double :" +Double.min_value+"~"+Double.max_value);
		}
	}