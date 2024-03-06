package Chapter02_XML.sample04;

import Chapter02_XML.sample03.SungJukDTO;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Scanner;

public class SungJukInput implements SungJuk {
    @Setter
    private SungJukDTO2 sungJukDTO2;
    @Setter
    private List<SungJukDTO2> list;

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = scanner.next();
        System.out.print("국어 입력 : ");
        int kor = scanner.nextInt();
        System.out.print("영어 입력 : ");
        int eng = scanner.nextInt();
        System.out.print("수학 입력 : ");
        int math = scanner.nextInt();
        int tot = kor + eng + math;
        double avg = tot / 3.0;

        sungJukDTO2.setName(name);
        sungJukDTO2.setKor(kor);
        sungJukDTO2.setEng(eng);
        sungJukDTO2.setMath(math);
        sungJukDTO2.setTot(tot);
        sungJukDTO2.setAvg(avg);

        list.add(sungJukDTO2);
        System.out.println("\n"+name+"님의 데이터를 입력하였습니다.");
    }


}
