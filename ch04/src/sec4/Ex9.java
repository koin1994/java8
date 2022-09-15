package sec4;

public class Ex9 {
	public static void main(String[] args) {
		int sum=1;
		long res=0;
		for(int a=1;a<=10;a++){
				sum*=a;
				res+=sum;
		}
		System.out.println("1!~10! = "+res);
		
	}
}
