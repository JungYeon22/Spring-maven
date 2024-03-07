package Chapter04_XML.user.dao;

import Chapter04_XML.user.bean.UserDTO;

import java.util.List;

public interface UserDAO {
    public void write(UserDTO userDTO);

    public List<UserDTO> getUserList();

    public UserDTO getUserById(String id);

    public int updateUser(UserDTO userDTO);

    public int deleteUser(String id);
}
