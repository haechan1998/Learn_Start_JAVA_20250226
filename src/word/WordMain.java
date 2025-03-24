package word;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		/* 단어장 프로그램
		 * 하나의 단어에 뜻이 여러개 등록
		 * class 활용. Map<String, ArrayList<String>> map
		 * 
		 * |1. 단어등록 | 2. 단어검색 | 3. 단어수정(단어뜻 수정)
		 * |4. 단어출력 | 5. 단어삭제 | 6. 단어를 파일로 출력 | 7.종료
		 * 
		 * WordController 를 생성하여 메서드 구현
		 * 기본단어 5가지 등록
		 * 
		 * 단어, 뜻 (ArrayList) / equals() 사용 : 단어가 같으면 같은 객체.
		 * 
		 */
		
		WordController c = new WordController();
		
		Scanner sc = new Scanner(System.in);
		
		int select = 0;
		c.baseWord();
		do {
			System.out.println("|1. 단어등록 | 2. 단어검색 | 3. 단어수정(단어뜻 수정)");
			System.out.println("|4. 단어출력 | 5. 단어삭제 | 6. 단어를파일로출력 | 7.종료");
			System.out.print("입력 >");
			select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.println("1.단어등록 | 2.단어뜻등록");
				int select2 = sc.nextInt();
				switch(select2) {
				case 1:
					c.insertWord(sc);
					break;
				case 2:
					c.insertMean(sc);
					break;
				}
				break;
			case 2: c.searchWord(sc); break;
			case 3:
				c.updateWord(sc);
				break;
			case 4: c.printWord(); break;
			case 5: c.deleteWord(sc); break;
			case 6: c.printFile(); break;
			case 7: System.out.println("종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다."); break;
				
			}
			
		}while(select != 6);
		
		sc.close();
	}

}
