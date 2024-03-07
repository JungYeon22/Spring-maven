package Chapter04_ANNO.user.service;

import Chapter04_ANNO.user.dao.UserDAO;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class UserDeleteService implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void execute() {
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("수정할 아이디 입력 : ");
        String id = scanner.next();

        int num = userDAO.deleteUser(id);

        if(num != 1){
            System.out.println("찾고자 하는 아이가 없습니다.");
        }else {
            System.out.println(id + "님의 데이터가 삭제되었습니다.");
        }


    }
}
