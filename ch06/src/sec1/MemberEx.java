package sec1;

public class MemberEx {
	public static void main(String[] args) {
		//클래스명  인스턴스명 = new 생성자함수();
		Member mem1 = new Member();
		mem1.setId("kty");
		mem1.setPassword("1234");
		System.out.println("아이디 : "+mem1.getId());
		System.out.println("비밀번호 : "+mem1.getPassword());
		System.out.println("이름 : "+mem1.getName());
		
		Member mem2 = new Member("kyj", "1004");
		System.out.println("아이디 : "+mem2.getId());
		System.out.println("비밀번호 : "+mem2.getPassword());
		mem2.setName("김태엽");
		System.out.println("과거는 바꾸지 못하지만, 현재를 통해 미래는 바꿀 수 있다.");
		System.out.println("이름 : "+mem2.getName());
		
		Member mem3 = new Member("kjh", "1548", "또조네");
		Member mem4 = new Member("kty", "1439", "또다른데보네", "사리현동");
		System.out.println("당신의 아이디 : "+mem4.getId());
		System.out.println("당신의 사는 곳 : "+mem4.getAddress());
		
		MemberController mc = new MemberController();
		mc.join("kty", "1004", "김태엽");
		mc.info();
		mc.login("kkt","1004");
		mc.info();
	}
}