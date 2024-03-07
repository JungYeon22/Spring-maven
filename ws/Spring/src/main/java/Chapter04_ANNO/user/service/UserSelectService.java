package Chapter04_ANNO.user.service;

import Chapter04_ANNO.user.bean.UserDTO;
import Chapter04_ANNO.user.dao.UserDAO;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSelectService implements UserService {

    private UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

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
