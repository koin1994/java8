package sec1;
//변수(Variable) : 컴퓨터는 작업에 필요한 데이터를 메모리에 저장하게 되는데 
//개발자가 프로그램을 처리하기 위해 필요한 데이터를 중간 중간에 메모리에 저장해야 한다. 
//그러나 그 위치를 모르면, 저장된 값을 가져 갈 수 없으므로, 자료의 저장위치를 나타내는 이름이 필요한데 그 것을 변수명이라 한다.
public class Var01 {
	public static void main(String[] args) {
			//변수선언 : 기억장소를 선언하는 것으로 변수명과 자료형이 같이 정의되어야 함
		int a=10, b=20, c; //정수형 변수
		char d='a', e; //문자 변수
		String f="kim", g, k; //문자열 변수
		float h=3.14f, i=0.25f; //실수형 변수
		
		//변수명 규칙
		/* 필수조건
		 * 예약어(Reserved word)와 키워드는 변수명으로 사용할 수 없다.
		 * 첫 번째 글자는 반드시 문자로 시작하거나 $ 또는 _로도 시작해야만 한다.
		 * 영문 대문자와 소문자로 된 변수명은 서로 다르게 인식된다.
		 * 변수명 중간에는 공백과 $,_를 제외한 특수문자는 지정될 수 없다.
		 * 
		 * 관례
		 * 상수인 경우는 일반적으로 모두 대문자로 지정한다.
		 * 누구나 저장된 데이터나 역할이 유추할 수 있도록 이름을 지정한다.
		 * 여러 단어를 합성한 변수명은 첫 번째 단어는 모두 소문자로 하고, 두 번째 단어의부터의 첫번째 글자는 대문자로 지정한다. = 카멜방식 
		 * 여러 단어를 합성한 변수명은 단어 사이 사이에 _로 연결한다. = 언더스코어방식
		 */
	}


byte bytevalue = 10;
float floatvalue = 2.5F;
double doublevalue = 2.5;
byte result = bytevalue + bytevalue;
//int result = 5 + bytevalue;
//float result = 5 + floatvalue;
//double result = 5 + doublevalue;
}