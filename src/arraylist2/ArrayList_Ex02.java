package arraylist2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Board {
	String title;
	String writer;
	String contents;
	int visit = 0;

	public Board() {}

	public Board(String title, String writer, String contents, int visit) {
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		this.visit = visit;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getVisit() {
		return visit;
	}

	public void setVisit(int visit) {
		this.visit = visit;
	}

	public String showBoard() {
		return "제목 : " + title + "작성자 : " + writer + "게시물 : " + contents + "조회수 : " + visit;
	}

}

public class ArrayList_Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Board> aList = new ArrayList<>();
		
		boolean isFlag = true;
		while(isFlag) {
			System.out.println("===========================");
			System.out.println("1. 게시물 등록하기 | 2. 게시물 목록보기 | 3. 시스템 종료");
			System.out.println("===========================");
			System.out.println();
			System.out.print("선택 > ");
			
			int content = sc.nextInt();
			System.out.println();
			
			switch(content) {
			
			case 1:
				System.out.println("1. 게시물 등록하기");
				System.out.println("===========================");
				System.out.println();

				System.out.println("등록할 게시물 > ");
				String tit = sc.next();
				
				System.out.println("작성자 > ");
				String wri = sc.next();
				
				System.out.println("내용 > ");
				String con = sc.next();
				
				
				aList.add(new Board(tit, wri, con, 50));
				
				System.out.println("게시물 등록이 완료되었습니다.");
				break;
				
			case 2:
				System.out.println("2. 게시물 목록보기");
				System.out.println("===========================");
				if(aList.size() == 0) {
					System.out.println("등록된 게시물이 없습니다.");
					
				}else {
					System.out.println("등록된 게시물 수 : " + aList.size());
					for(Board result : aList) {
						System.out.println(result.showBoard());
					}
					
				}
				System.out.println();
				break;
				
			default:
				System.out.println("3. 시스템 종료.");
				System.exit(0);
			}
			
		}
		
		

	}

}
