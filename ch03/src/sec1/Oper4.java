package sec1;

public class Oper4 {
	public static void main(String[] args) {
		int a=200, b=100, c=20, d=10;
		//비교연산자(==,!=,>,>=,<,<=) -> true 또는 false로 결과가 산출됨
		//== 같다(이다)
		//!= 같지 않다(다르다)
		//>  크다(초과==후)
		//>= 크거나 작다(이상==이후)
		//< 작다(미만=전)
		//<= 작거나 같다(이하==이전)
		System.out.println("a>b => "+(a>b)); //true
		System.out.println("a!=b => "+(a!=b)); //true
		System.out.println("a==b => "+(a==b)); //false
		System.out.println("a>=b => "+(a>=b)); //true
		System.out.println("a<=b => "+(a<=b)); //false
		System.out.println("a<b => "+(a<b)); //false
		System.out.println("a가 문자열 맞냐? => "+a instanceof String); //true
		//논리연산자
		System.out.println("a>b && c>d =>"+(a>b && c>d)); //true
		System.out.println("a<b || c<d =>"+(a<b || c<d)); //false
		System.out.println("!(a>b) => "+(!(a>b))); //false (!=not 부정 -> 결과값을 반대로 만듦)
		//삼항연산자 => 조건 ? 참일때식 : 거짓일때식
		System.out.println(a>=b ? "크거나 같다" : "작다");
	}
}
