package Chapter04_ANNO.user.service;

import Chapter04_ANNO.user.bean.UserDTO;
import Chapter04_ANNO.user.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class UserUpdateService implements UserService {
    private UserDAO userDAO;
    private UserDTO userDTO;

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Autowired
    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    @Override
    public void execute() {
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("수정할 아이디 입력(exit:-1) : ");
            String id = scanner.next();
            if(id.equals("-1")) break;

            UserDTO userDTO = userDAO.getUserById(id);
            if(userDTO == null){
                System.out.println("찾고자 하는 아이디가 없습니다.");

            }else{
                System.out.print("수정할 이름 입력 : ");
                String name = scanner.next();
                System.out.print("수정할 비밀번호 입력 : ");
                String pwd = scanner.next();

                userDTO.setId(id);
                userDTO.setName(name);
                userDTO.setPwd(pwd);
                userDAO.updateUser(userDTO);
                System.out.println(id + "님의 데이터를 수정하였습니다.");
                break;
            }
        }


    }
}
