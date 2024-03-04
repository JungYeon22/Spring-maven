package sample05;

import java.util.Scanner;

public class SungJukImpl implements SungJuk {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	public SungJukImpl() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("name : ");
		this.name = scanner.next();
		System.out.print("kor : ");
		this.kor =  scanner.nextInt();
		System.out.print("eng : ");
		this.eng = scanner.nextInt();
		System.out.print("math : ");
		this.math = scanner.nextInt();
	}

	public void calc() {
		this.tot = kor + eng + math;
		this.avg = tot / 3.0;
	}

	public void display() {
		System.out.println("이름\t국어\t수학\t영어\t총점\t평균");
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg);
	}

}
