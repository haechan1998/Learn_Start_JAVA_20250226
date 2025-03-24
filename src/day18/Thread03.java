package day18;

public class Thread03 {

	public static void main(String[] args) {
		/* 1~50까지, 51~100까지의 합을 구하는 두개의 Thread 를 생성
		 * 
		 * 두개의 Thread 가 실행되고 난 뒤
		 * Thread-0 1~50 까지의 출력 후 합계 출력
		 * Thread-1 51~100 까지의 출력 후 합계 출력
		 * 
		 * main Thread-0 Thread-1 합을 출력. 
		 * 
		 * Thread.sleep() : 기다렸다가 실행
		 * millisecond 단위 1초 = 1000
		 * 
		 * */
		MyThread001 th1 = new MyThread001();
		MyThread002 th2 = new MyThread002();
	
		th1.start();
		
		try {
			th1.join();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		th2.start();
		
		try {
			th2.join();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int result = th1.getSum() + th2.getSum();
		System.out.println("Thread-0 Thread-1 합 >" + result);
	}

}

class MyThread001 extends Thread{
	private int sum;
	
	@Override
	public void run() {
		for(int i=1; i<=50; i++) {
			sum += i;
			System.out.println(i + ".Thread 1>" + Thread.currentThread().getName());
		}
		System.out.println("MyThread01의 합계 > " + sum);
		System.out.println();
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
}

class MyThread002 extends Thread{
	private int sum;

	@Override
	public void run() {
		for(int i=51; i<=100; i++) {
			sum += i;
			System.out.println(i + ".Thread 2>" + Thread.currentThread().getName());
		}
		System.out.println("MyThread02의 합계 > " + sum);
		System.out.println();
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
}















