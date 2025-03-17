package day10;

import java.util.Arrays;

public class Report {
	
	private String name; // 이름 // 언제쓰지..
	private int sum; // 합계
	private double avg; // 평균
	private int[] score = new int[3]; // 국어점수, 영어점수, 수학점수
	private int rank;
	
public Report() {} // 기본생성자

public Report(String name) {
	
	this.name = name;
}

@Override
public String toString() {
	return "Report [name=" + name + ", sum=" + sum + ", avg=" + avg + ", score=" + Arrays.toString(score) + ", rank="
			+ rank + "]";
}

// 국어, 영어, 수학 을 입력받는 배열 생성
public void randomInput() {
	
	for(int i=0; i<score.length; i++) {
		this.score[i]=(int)(Math.random()*50)+50;
	}
	sum();
	avg();
}

// 과목의 총점을 구하는 메서드
public void sum() {
	
	for(int i=0; i<score.length; i++) {
		this.sum += score[i]; 
	}
	
}

// 과목의 평균을 구하는 메서드
public void avg() {
	
	this.avg = sum/(double)3;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSum() {
	return sum;
}

public void setSum(int sum) {
	this.sum = sum;
}

public double getAvg() {
	return avg;
}

public void setAvg(double avg) {
	this.avg = avg;
}

public int[] getScore() {
	return score;
}

public void setScore(int[] score) {
	this.score = score;
}

public int getRank() {
	return rank;
}

public void setRank(int rank) {
	this.rank = rank;
}



}
