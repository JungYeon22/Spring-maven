package Chapter05_XML.user.dao;

import Chapter05_XML.user.bean.UserDTO;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
public class UserDAOImpl implements UserDAO{
    @Setter
    private JdbcTemplate jdbcTemplate;

    @Override
    public void write(UserDTO userDTO) {
        String sql = "insert into usertable values(?, ?, ?)";
        // insert, update, delete -> update()
        jdbcTemplate.update(sql, userDTO.getName(), userDTO.getId(), userDTO.getPwd());
    }

    @Override
    public List<UserDTO> getUserList() {
        String sql = "select * from usertable";
        List<UserDTO> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(UserDTO.class));// 한줄 한줄 Mapping처리를 해줌(UserDTO.class 타입으로)
        return list;
    }
}
*/

/*
public class UserDAOImpl extends JdbcDaoSupport implements UserDAO {
    @Override
    public void write(UserDTO userDTO) {
        String sql = "insert into usertable values(?, ?, ?)";
        // insert, update, delete -> update()
        getJdbcTemplate().update(sql, userDTO.getName(), userDTO.getId(), userDTO.getPwd());
    }

    @Override
    public List<UserDTO> getUserList() {
        String sql = "select * from usertable";
        List<UserDTO> list = getJdbcTemplate().query(sql, new BeanPropertyRowMapper<>(UserDTO.class));// 한줄 한줄 Mapping처리를 해줌(UserDTO.class 타입으로)
        return list;
    }
}*/
public class UserDAOImpl extends NamedParameterJdbcDaoSupport implements UserDAO {
    @Override
    public void write(UserDTO userDTO) {
        Map<String, String> map = new HashMap<>();
        map.put("name", userDTO.getName());
        map.put("id", userDTO.getId());
        map.put("pwd", userDTO.getPwd());
        String sql = "insert into usertable values(:name, :id, :pwd)";
        getNamedParameterJdbcTemplate().update(sql, map);
    }

    @Override
    public List<UserDTO> getUserList() {
        String sql = "select * from usertable";
        List<UserDTO> list = getJdbcTemplate().query(sql, new BeanPropertyRowMapper<>(UserDTO.class));// 한줄 한줄 Mapping처리를 해줌(UserDTO.class 타입으로)
        return list;
    }

    @Override
    public UserDTO getUserById(String id) {
        Map<String, String> map = new HashMap<>();
        map.put("id", id);
        String sql = "select * from usertable where id=:id";
        try{
            return getNamedParameterJdbcTemplate().queryForObject(sql, map, new BeanPropertyRowMapper<>(UserDTO.class));
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public int updateUser(UserDTO userDTO) {
        String sql = "update usertable set name=?, pwd=? where id=?";
        int num = getJdbcTemplate().update(sql, userDTO.getName(), userDTO.getPwd(), userDTO.getId());
        return num;
    }

    @Override
    public int deleteUser(String id) {
        String sql = "delete from usertable where id=?";
        return getJdbcTemplate().update(sql, id);
    }
}