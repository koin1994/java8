package sec3;

import java.util.Scanner;

public class Loop2 {
	public static void main(String[] args) {
		int jum[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int n=0;n<jum.length;n++){
			System.out.println((n+1)+"번째 사람 점수 : ");
			jum[n] = sc.nextInt();
	}
/*		반복변수=초기값
		while(조건식) {
			반복실행문;
			증감식;
		}
*/
	
		int n=0;
		int tot=0;
		while(n<jum.length){
			tot=tot+jum[n];
			n++;
		}
		System.out.println("전체 총점: "+tot);
	}
}