package Chapter02_ANNO.sample04;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;
@Component
public class SungJukDelete implements SungJuk {
    @Autowired
    @Qualifier("arrayList")
    private List<SungJukDTO2> list;
    @Override
    public void execute() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.print("삭제할 이름 입력 : ");
        String name = scanner.next();

        boolean exist = false;
        for (SungJukDTO2 sungJukDTO2 : list) {
            if (sungJukDTO2.getName().equals(name)) {
                System.out.println("이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균");
                System.out.println(sungJukDTO2);

                list.remove(sungJukDTO2);
                System.out.println("\n"+name+"님의 데이터를 수정하였습니다.");
                exist = true;
                break;
            }
        }
        if (!exist) {
            System.out.println("해당 이름은 존재하지 않습니다.");
        }

    }
}
