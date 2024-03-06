package Chapter02_XML.sample04;

import lombok.Setter;

import java.util.List;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {
    @Setter
    private List<SungJukDTO2> list;

    @Override
    public void execute() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.print("수정할 이름 입력 : ");
        String name = scanner.next();
        boolean exist = false;
        for (SungJukDTO2 sungJukDTO2 : list) {
            if (sungJukDTO2.getName().equals(name)) {
                System.out.println("이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균");
                System.out.println(sungJukDTO2);

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

                System.out.println("\n"+name+"님의 데이터를 수정하였습니다.");
                exist = true;
            }
        }
        if (!exist) {
            System.out.println("해당 이름은 존재하지 않습니다.");
        }


    }
}
