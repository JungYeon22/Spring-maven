package Chapter02_ANNO.sample04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
@Scope("prototype")
public class SungJukInput implements SungJuk {
    //생성된 빈들 중에서 SungJukDTO2타입을 찾아서 자동으로 매핑을 해라
    // 생성자 또는 Setter 이건 상관없이 SungJukDTO2 타입을 찾아서 자동으로 매핑을 해라
    @Autowired
    private SungJukDTO2 sungJukDTO2;

    @Autowired
    @Qualifier("arrayList")
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
