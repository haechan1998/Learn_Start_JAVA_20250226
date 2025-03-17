package day13;

public class Exception06 {

	public static void main(String[] args) {

		int start = 1, count = -5, size = -1; // start 는 랜덤 시작값, size 는 랜덤 범위, count 는 배열 범위
	
		Exception06 e06 = new Exception06();
		
		try {
			e06.createArr(start, count, size);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("뭐 어떻게 하는건지 모르겠당~");
		}
		start = 1;
		count = 10;
		size = 3;
		
		int[] arr1 = e06.createArr(start, count, size);
		
		for(int i=0; i <arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		
	}
	
	/* size 를 입력받아 size 만큼의 길이를 가지는 배열을 생성
	 * 랜덤값을 채워 배열을 리턴
	 * 랜덤값의 범위는 start(시작), count(개수)
	 * - size 가 0보다 작으면 예외발생
	 * - count 개수가 0보다 작다면 예외발생
	 * 
	 * */
	
	public int[] createArr(int start, int count, int size) { // 
		// RuntimeException 으로 예외 넘기기.
		
		if(size <= 0) {
			throw new RuntimeException("배열의 길이가 0보다 작습니다.");
		} 
		if(count <= 0) {
			throw new RuntimeException("random의 범위가 0보다 작습니다.");
		}
		
		int[] arr = new int[size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * count) + start;
		}
		
		return arr;
		
	}

}
