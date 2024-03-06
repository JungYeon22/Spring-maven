package Chapter02_XML.sample03;

import java.util.Formatter;
import java.util.Scanner;

import javax.swing.text.NumberFormatter;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SungJukImpl implements SungJuk {
	@NonNull
	private SungJukDTO sungJukDTO;
	
	@Override
	public void calcTot() {
		int total = sungJukDTO.getKor() + sungJukDTO.getEng() + sungJukDTO.getMath();
		sungJukDTO.setTot(total);
	}

	@Override
	public void calcAvg() {
		double avg = sungJukDTO.getTot()/3.0;
		sungJukDTO.setAvg(avg);
	}

	@Override
	public void display() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(sungJukDTO.toString());
	}

	@Override
	public void modify() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = scanner.next();
		System.out.print("국어 입력 : ");
		int kor =  scanner.nextInt();
		System.out.print("영어 입력 : ");
		int eng = scanner.nextInt();
		System.out.print("수학 입력 : ");
		int math = scanner.nextInt();
		
		sungJukDTO.setName(name);
		sungJukDTO.setKor(kor);
		sungJukDTO.setEng(eng);
		sungJukDTO.setMath(math);
		

	}

}
