package day14;

import java.util.HashMap;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		/* map 을 이용한 단어장 프로그램 작성 / 영어단어 비슷한거인듯?
		 * 
		 * |1. 단어등록 | 2. 단어검색 | 3. 단어수정(단어뜻 수정)
		 * |4. 단어출력 | 5. 단어삭제 | 6. 종료
		 * 
		 * WordController 를 생성하여 메서드 구현
		 * 
		 * 기본단어 5가지 일단 등록
		 * */
		
		// 기본단어.
		
		WordController c = new WordController();
		
		Scanner sc = new Scanner(System.in);
		
		int select = 0;
		c.baseWord();
		do {
			System.out.println("|1. 단어등록 | 2. 단어검색 | 3. 단어수정(단어뜻 수정)");
			System.out.println("|4. 단어출력 | 5. 단어삭제 | 6. 종료");
			System.out.print("입력 >");
			select = sc.nextInt();
			switch(select) {
			case 1: c.insertWord(sc); break;
			case 2: c.searchWord(sc); break;
			case 3: c.updateWord(sc); break;
			case 4: c.printWord(); break;
			case 5: c.deleteWord(sc); break;
			case 6: System.out.println("종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다."); break;
				
			}
			
		}while(select != 6);
		
	}

}

class WordController{
	
	private HashMap<String, String> word = new HashMap<>();
	
	// 기본단어등록
	public void baseWord() {
		word.put("Java", "자바");
		word.put("JS", "자바스크립트");
		word.put("Human", "사람");
		word.put("Dog", "개");
		word.put("Cat", "고양이");
	}
	
	// 1. 단어등록
	public void insertWord(Scanner sc) {
		System.out.println("등록할 단어 >");
		String inputWord = sc.next();
		System.out.println("등록할 뜻 >");
		String inputMean = sc.next();
		
		word.put(inputWord, inputMean);
		System.out.println("등록이 완료되었습니다.");
		
	}
	// 2. 단어검색 > 이따 다시 해보자.
	public void searchWord(Scanner sc) {
		System.out.print("검색할 단어를 입력하세요. >");
		String search = sc.next();
		for(String w : this.word.keySet()) {
			if(w.equals(search)) {
				System.out.println("단어 :" + w + " / 뜻 :" + word.get(w));
			}
		}
		
	}
	
	// 3. 단어수정
	public void updateWord(Scanner sc) {
		System.out.println("수정할 단어를 입력하세요. >");
		String search = sc.next();
		System.out.println("바꿀 단어를 입력하세요. >");
		String update = sc.next();
		
		word.put(search, update);
		
	}
	
	// 4. 단어출력
	public void printWord() {
		System.out.println("--단어 목록--");
		for(String w : this.word.keySet()) {
			System.out.println("단어 : "+ w + " | 뜻: " + this.word.get(w));
		}
		
	}
	
	// 5. 단어삭제
	public void deleteWord(Scanner sc) {
		System.out.print("삭제할 단어를 입력하세요. >");
		String search = sc.next();
		word.remove(search);

		System.out.println("삭제가 완료되었습니다.");
		
	}

}