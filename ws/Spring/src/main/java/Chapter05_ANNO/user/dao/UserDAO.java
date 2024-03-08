package Chapter05_ANNO.user.dao;

import Chapter05_ANNO.user.bean.UserDTO;

import java.util.List;

public interface UserDAO {
    public void write(UserDTO userDTO);

    public List<UserDTO> getUserList();

    public UserDTO getUserById(String id);

    public int updateUser(UserDTO userDTO);

    public int deleteUser(String id);
}
