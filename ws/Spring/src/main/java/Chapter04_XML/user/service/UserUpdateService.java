package Chapter04_XML.user.service;

import Chapter04_XML.user.bean.UserDTO;
import Chapter04_XML.user.dao.UserDAO;
import lombok.Setter;

import java.util.Scanner;

public class UserUpdateService implements UserService{
    @Setter
    private UserDAO userDAO;
    @Setter
    private UserDTO userDTO;
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
