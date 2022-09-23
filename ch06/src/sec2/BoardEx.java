package sec2;

import java.util.Date;
import java.util.Scanner;

public class BoardEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//임의의 Board 객체 배열 100개 생성
	Board[] board = new Board[100];
	for(int i=0;i<board.length;i++){
		board[i] = new Board();
	}
	
	boolean sw = true; //작업 계속 여부
	int cnt = 0; //배열의 개수 카운트
	
	while(sw){
		System.out.println("작업번호 입력 : ");
		int job = sc.nextInt();
		int idx;
		String title;
		String content;
		String author;
		switch(job){
			case 1 :
				System.out.println("***** 입력 작업 *****");
				System.out.println("제목 : ");
				title = sc.next();
				System.out.println("내용 : ");
				content = sc.next();
				System.out.println("작성자 : ");
				author = sc.next();
				Date resdate = new Date();
				board[cnt].boardWrite(cnt, title, content, author, resdate);
				cnt++;
				break;
			case 2:
				System.out.println("***** 수정 작업 *****");
				System.out.print("글 번호 : ");
				idx = sc.nextInt();
				for(int a=0;a<=cnt;a++){
					board[a].boardDelete(idx);
				}
				break;
			case 3:
				System.out.println("***** 삭제 작업 *****");
				System.out.println("글 번호 : ");
				idx = sc.nextInt();
				for(int a=0;a<=cnt;a++){
					board[a].boardDelete(idx);
				}
				break;
			case 4:
				System.out.println("***** 검색 작업 *****");
				System.out.println("글 번호: ");
				idx = sc.nextInt();
				for(int a=0;a<=cnt;a++){
					board[a].boardDelete(idx);
				}
				break;
			default:
				System.out.println("프로그램 종료");
				sw = false;
			}
		}
	sc.close();
	}
}
