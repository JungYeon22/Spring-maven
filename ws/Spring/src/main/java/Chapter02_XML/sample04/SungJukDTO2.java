package Chapter02_XML.sample04;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Setter
@Getter
public class SungJukDTO2 {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int tot;
    private double avg;

    @Override
    public String toString() {
        return name + "\t\t" + kor + "\t\t" + eng
                + "\t\t" + math + "\t\t" + tot + "\t\t" + avg;
    }
}
