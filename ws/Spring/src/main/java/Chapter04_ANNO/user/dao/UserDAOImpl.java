package Chapter04_ANNO.user.dao;

import Chapter04_ANNO.user.bean.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDAOImpl extends NamedParameterJdbcDaoSupport implements UserDAO {

    // JdbcDaoSupport의 setDataSource가 final이기 때문에 Override 할 수 없다.
    @Autowired
    public void setDS(DataSource dataSource){
        setDataSource(dataSource);  //JdbcDaoSupport의 setDataSource 호출
    }


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