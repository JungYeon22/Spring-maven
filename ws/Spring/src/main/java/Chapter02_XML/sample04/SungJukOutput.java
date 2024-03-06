package Chapter02_XML.sample04;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class SungJukOutput implements SungJuk{
    @Setter
    private List<SungJukDTO2> list;

    @Override
    public void execute() {
        System.out.println("이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균");
        for(SungJukDTO2 data : list){
            System.out.println(data.toString());
        }
    }


}
