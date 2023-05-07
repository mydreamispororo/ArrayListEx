package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Register {
	String userid;
	String passwd;
	String username;

	public Register() {
	}

	public Register(String userid, String passwd, String username) {
		this.userid = userid;
		this.passwd = passwd;
		this.username = username;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String showRegister() {
		return "아이디 : " + userid + " | 비밀번호 : " + passwd + " | 이름 : " + username;
	}
}

public class ArrayList_Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// list, 생성자로 저장, scanner, 3명만
		// 저장은 객체명.add 배열 개수는 객체명.size();

		List<Register> aList = new ArrayList<>();
		
		//무한루프 : 변수이름은 flag, run
		//while(true) {}
		boolean isFlag = true;
		while(isFlag) {
			System.out.println("===========================");
			System.out.println("1. 회원가입 | 2. 회원목록 | 3. 프로그램 종료");
			System.out.println("===========================");
			System.out.println();
			System.out.print("선택 > ");
			
			int menu = sc.nextInt();
			System.out.println();
			
			switch(menu) {
			
			case 1:
				System.out.println("1. 회원가입");
				System.out.println("===========================");
				System.out.println();
				
				System.out.println("아이디 > ");
				String uid = sc.next();
				
				System.out.println("비밀번호 > ");
				String pwd = sc.next();
				
				System.out.println("이름 > ");
				String uname = sc.next();
				
				aList.add(new Register(uid, pwd, uname));
				
				System.out.println("회원가입이 완료 되었습니다. 회원목록을 조회해 보세요.");
				
				
				break;
				
			case 2:
				System.out.println("2. 회원목록");
				System.out.println("===========================");
				if(aList.size() == 0) {
					System.out.println("가입된 회원이 없습니다. 회원가입을 먼저 진행해 주세요");
					
				}else {
					System.out.println("가입된 회원 수 : " + aList.size());
					for(Register result : aList) {
						System.out.println(result.showRegister());
					}
					
				}
				
				System.out.println();
				break;
				
			case 3:
				System.out.println("3. 프로그램을 종료합니다.");
				System.exit(0);
				
			default:
				System.out.println("다시 입력해주세요 !!");
				break;
			}
			
		}
		
		
		
		
	}

}
