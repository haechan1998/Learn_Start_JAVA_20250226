package day08;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* Tv 클래스 생성
		 * 멤버변수 : brand, power, channel(1~30) 순환구조, volume(1~10) 범위지정 / 0일경우 음소거
		 * */
		
		// 화면 시작 시 브랜드명 노출. power 가 true 일 경우에만 작동.
		/* 메서드 :
		 * power()
		 * channelUp() / channelDown() : 1씩 증가 / 감소
		 * 30까지 있음 30이 넘어가면 1로 순환구조
		 * 
		 * volumeUp / volumeDown() : 1씩 증가 / 감소
		 * vol 10까지 있음. 10이 넘으면 10, 0 이면 음소거라고 출력
		 * */ 
		Scanner sc = new Scanner(System.in);
		
		Tv tv = new Tv();
		
		System.out.println("================ 리 모 컨 =================");
		System.out.println("| 1.전원켜기  | 2.volumeUp  | 3.volumeDown |");
		System.out.println("|   전원끄기  | 4.channelUp | 5.channelDown|");
		System.out.println("=========================================");
		do {
			
			int	controler = sc.nextInt();
			switch(controler) {
			case 1:
				tv.power();
				tv.tvInfoBrand();
				break;
			case 2:
				tv.volumeUp();
				break;
			case 3:
				tv.volumeDown();
				break;
			case 4:
				tv.channelUp();
				break;
			case 5:
				tv.channelDown();
				break;
			}
			
		}while(tv.isPower());
		
		sc.close();
		
	}

}

class Tv{
	//멤버변수 : brand, power, channel, volume
	private String brand = "LG";
	private boolean power;
	private int channel = 1, volume;
	
	// tv 브랜드 출력
	public void tvInfoBrand() {
		System.out.println("제조사" + brand);
	}
	
	// 메서드 power
	public void power() {
		power = !power;
			System.out.println(power ? "전원 ON" : "전원 OFF");
	}
	
	// 메서드 channelUp
	public void channelUp() {
		if(power) {
			channel++;
			if(channel >= 30) {
				channel = 1;
			}
			System.out.println("현재채널 " + channel);
		}
	}
	
	// 메서드 channelDown
	public void channelDown() {
		if(power) {
			channel--;
			if(channel < 1) {
				channel = 30;
			}
			System.out.println("현재채널 " + channel);
		}
	}
	
	// 메서드 volumeUp
	public void volumeUp() {
		if(power) {
			if(volume >= 10) {
				volume = 10;
				System.out.println("최대 음량입니다.");
			}else {
				volume++;
				System.out.println("현재음량 " + volume);
			}
		}
	}
	
	public void volumeDown() {
		if(power) {
			if(volume <= 0) {
				volume = 0;
				System.out.println("음소거");
			}else {
				volume--;
				System.out.println("현재음량 " + volume);
				
			}
		}
	}
	
	// getter / setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}