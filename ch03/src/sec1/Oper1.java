package sec1;
//프로그램(Operation)의 모든 명령은 Op-code(연산자) 와 Operand(피연산자)로 이루어지며,
//주소(기억장소의 개수)에 따라 0주소 명령어 형식 ~ 3주소 명령어 형식
//입력함에 따라 단항 연산(unary)과 이향 연산(binary)으로 분류됨
//연산의 종류에 따라 산술,논리,비교,비트,증감,대입 연산 등이 있음
//+ : 연산(명령) -> Op-code
//a, b -> Operand
public class Oper1 {
	public static void main(String[] args) {
		//int a=20, b=30 //c;
		//System.out.println(a);
		prt();
		//c = a + b;
		//운용방식1 : +ab - pre(fix) order(전위)
		//운용방식2 : ab+ - post(fix) order(후위)
		//운용방식3 : a+b - in(fix) order(중위)
	}

	public static void prt(){
		System.out.println("data");
	}
}


