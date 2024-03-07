package Chapter04_ANNO.user.service;

import Chapter04_ANNO.user.bean.UserDTO;
import Chapter04_ANNO.user.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class UserInsertService implements UserService {
    @Autowired
    private UserDTO userDTO;
    @Autowired
    private UserDAO userDAO;


    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = scanner.next();
        System.out.print("아이디 입력 : ");
        String id = scanner.next();
        System.out.print("비밀번호 입력 : ");
        String pwd = scanner.next();

        userDTO.setName(name);
        userDTO.setId(id);
        userDTO.setPwd(pwd);

        userDAO.write(userDTO);

        System.out.println(name + "님의 데이터를 저장하였습니다.");

    }
}
