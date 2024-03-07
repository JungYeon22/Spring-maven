package Chapter04_XML.user.service;

import Chapter04_XML.user.bean.UserDTO;
import Chapter04_XML.user.dao.UserDAO;
import lombok.Setter;

import java.util.Scanner;

public class UserDeleteService implements UserService{
    @Setter
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
