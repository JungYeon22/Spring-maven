package Chapter05_ANNO.user.service;

import Chapter05_ANNO.user.bean.UserDTO;
import Chapter05_ANNO.user.dao.UserDAO;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSelectService implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public void execute() {
        System.out.println();

        List<UserDTO> list = userDAO.getUserList();

        System.out.println("이름-----아이디-----비밀번호");
        for(UserDTO userDTO : list){
            System.out.println(userDTO);
        }
    }
}
