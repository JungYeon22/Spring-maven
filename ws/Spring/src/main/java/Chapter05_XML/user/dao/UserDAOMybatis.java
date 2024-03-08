package Chapter05_XML.user.dao;

import Chapter05_XML.user.bean.UserDTO;
import lombok.Setter;
import org.apache.ibatis.session.SqlSession;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional  // commit(); & close()
public class UserDAOMybatis implements UserDAO{
    @Setter
    private SqlSession sqlSession;

    @Override
    public void write(UserDTO userDTO) {
        sqlSession.insert("userSQL.write", userDTO);
    }

    @Override
    public List<UserDTO> getUserList() {
        return sqlSession.selectList("userSQL.getUserList");
    }

    @Override
    public UserDTO getUserById(String id) {
        return sqlSession.selectOne("userSQL.getUserById", id);
    }

    @Override
    public int updateUser(UserDTO userDTO) {
        return sqlSession.update("userSQL.updateUser", userDTO);
    }

    @Override
    public int deleteUser(String id) {
        return sqlSession.delete("userSQL.deleteUser", id);
    }
}
