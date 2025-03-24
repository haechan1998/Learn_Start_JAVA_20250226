package word;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WordController {
	private HashMap<String,ArrayList<String>> map = new HashMap<>();

	
	
	// 기본단어 5개 등록
	public void baseWord() {
		map.put("Apple", new ArrayList<String>());
		map.get("Apple").add("사과");
		map.put("Kiwi", new ArrayList<String>());
		map.get("Kiwi").add("키위");
		map.put("Mango", new ArrayList<String>());
		map.get("Mango").add("망고");
		map.put("Java", new ArrayList<String>());
		map.get("Java").add("자바");
		map.put("JS", new ArrayList<String>());
		map.get("JS").add("자바스크립트");
		
	}
	
	// 단어등록
	public void insertWord(Scanner sc) {
		System.out.println("단어 >");
		String word = sc.next();
		System.out.println("뜻 >");
		String mean = sc.next();
		
		map.put(word, new ArrayList<String>());
		map.get(word).add(mean);
		
	}
	
	// 단어등록2 (뜻만 추가로 등록)
	public void insertMean(Scanner sc) {
		System.out.println("단어 >");
		String word = sc.next();
		System.out.println("추가하려는 뜻");
		String mean = sc.next();
		
		for(String key : map.keySet()) {
			if(key.equals(word)) {
				map.get(key).add(mean);
			}
		}
		
	}
	
	// 단어검색
	public void searchWord(Scanner sc) {
		System.out.println("검색하려는 단어 >");
		String word = sc.next();
		for(String key : map.keySet()) {
			for(int i=0; i<map.get(key).size(); i++) {
				if(key.equals(word)) {
					System.out.println(key + "=" + map.get(key).get(i));
			
				}
				
			}
			
		}
		
	}
	// 단어수정
	public void updateWord(Scanner sc) {
		
		System.out.println("수정하려는 단어 >");
		String word = sc.next();
		System.out.println("수정하려는 뜻 >");
		String mean = sc.next();
		System.out.println("수정 후 뜻 >");
		String replaceMean = sc.next();
		
		for(String key : map.keySet()) {
			for(int i=0; i<map.get(key).size(); i++) {
				if(key.equals(word) && map.get(key).get(i).equals(mean)) {
					map.remove(word);
					map.put(word, new ArrayList<String>());
					map.get(word).add(replaceMean);
					return;
			
				}
				
			}
			
		}
		
	}
	
	// 단어출력
	public void printWord() {
		for(String key : map.keySet()) {
			System.out.print(key+"=");
			for(int i=0; i<map.get(key).size(); i++) {
				System.out.print(map.get(key).get(i));
				if(map.get(key).size() > 1) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
		
	}
	
	// 단어삭제
	public void deleteWord(Scanner sc) {
		System.out.println("삭제하려는 단어 >");
		String deleteWord = sc.next();
		for(String key : map.keySet()) {
			if(key.equalsIgnoreCase(deleteWord)) {
				map.remove(key);
				return;
			}
		}
	}
	// 파일로 보내기.
	public void printFile() throws IOException {
		FileWriter fw = new FileWriter("D:\\web_java_chc\\workspace\\java\\src\\word\\word.txt");
		for(String key : map.keySet()) {
			for(int i=0; i<map.get(key).size(); i++) {
				fw.write(key + "=" +map.get(key).get(i));
				if(map.get(key).size() > 1) {
					fw.write(",");
				}
			}
			fw.write("\r\n");
		}
		fw.close();
	}

	public HashMap<String, ArrayList<String>> getMap() {
		return map;
	}

	public void setMap(HashMap<String, ArrayList<String>> map) {
		this.map = map;
	}

	
	
}
