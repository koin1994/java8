package sec4;

public class Ex5 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
				if(j==i){
					System.out.println();
				}
			}
		}
			System.out.println("\n");
			
			for(int i=0;i<5;i++){
				for(int j=5;j>i;j--){
					System.out.print("*");
			}
					System.out.println("\n");
		}
	}
}