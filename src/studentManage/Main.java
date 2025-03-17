package studentManage;

import java.util.Scanner;

public class Main {
	/*
	 * 0000111111 조해찬 50 01082567739 집
	 */

	public static void main(String[] args) {
		
		// 클래스를 기본적인것만 생성한 후에 메인의 그림을 잡아놓고 필요한 클래스의 메서드를 만든다.
		
		Scanner scan = new Scanner(System.in);
		
		StudentController sCtrl = new StudentController();
		sCtrl.addSubArr();
		int select = 0;
		
		do {
			System.out.println("========================================");
			System.out.println("1. 학생등록 |2. 학생리스트	| 3. 학생검색");
			System.out.println("4. 수강신청 |5. 수강철회	| 6. 종료");
			System.out.println("========================================");
			
			select = scan.nextInt();
			switch(select) {
			case 1:
				sCtrl.insetStudent(scan); // 학생등록
				break;
			case 2:
				sCtrl.printStudent(); // 학생리스트
				break;
			case 3:
				sCtrl.searchStudent(scan);
				break;
			case 4: 
				sCtrl.insertSubject(scan); // 수강신청전 수강정보 확인.
				break;
			case 5:
				sCtrl.deleteSubject(scan);
				break;
			case 6:
				System.out.println("종료되었습니다.");
				break;
			default:
				
			}
			
		}while(select != 6);
		
		
		
		
		
		
		scan.close();
				
	}

}
